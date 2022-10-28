//获取元素 下拉菜单
// var dt = document.querySelector('.dt');
// var dd = document.querySelector('.dd');
// var dpn = document.querySelector('.dropdown')
// dt.addEventListener('mouseover', function () {
//     dd.style.display = 'block';
//     dd.addEventListener('mouseover', function () {
//         dd.style.display = 'block';
//     })
// })
// dpn.addEventListener('mouseout', function () {
//     dd.style.display = 'none';
// })
// window.addEventListener('load',function () {
//     //底部精灵图
//     var fdn = document.querySelectorAll('.service_demon');
//     for (var i = 0; i < fdn.length; i++) {
//         var indey = i * (-52) - 2;
//         fdn[i].style.backgroundPosition = '-17px' + indey + 'px';
//     }
// })

// main样式功能
window.addEventListener('load', function () {
    // 1.获取元素
    var arrow_l = document.querySelector('.arrow-l');
    var arrow_r = document.querySelector('.arrow-r');
    var focus = document.querySelector('.focus');
    var focusWidth = focus.offsetWidth;
    // 2.鼠标经过focus 就显示隐藏左右按钮
    focus.addEventListener('mouseenter', function () {
        arrow_l.style.display = 'block';
        arrow_r.style.display = 'block';
        clearInterval(timer);
        timer = null; //清除定时器
    })
    focus.addEventListener('mouseleave', function () {
        arrow_l.style.display = 'none';
        arrow_r.style.display = 'none';
        timer = setInterval(function () {
            // 手动调用点击事件
            arrow_r.click();
        },2000);
    })
    // 3. 动态生成小圆圈   有几张图片,就生成几个小圆圈
    var ul = focus.querySelector('ul');   // 获取元素时记得限定获取范围 (无法使用All,因为li都会出现在focus类下)
    var ol = focus.querySelector('.circle');
    var num = 0;
    var circle = 0;
    // console.log(ul.children.length)
    for (var i = 0; i < ul.children.length; i++) {
        // 创建一个小li
        var li = document.createElement('li');
        // 记录当前小li的索引号  通过自定义属性来获取
        li.setAttribute('index', i);
        // 把小li插入到ol 里面
        ol.appendChild(li);
        // 4. 小圆圈的排他思想  我们可以直接在生成小圆圈的同时直接绑定点击事件
        li.addEventListener('click', function () {
            // 干掉所有人 把所有的小li 清除 current 类名
            for (var i = 0; i < ol.children.length; i++) {
                ol.children[i].className = '';
            }
            // 留下我自己  当前的小li 设置current 类名
            this.className = 'current';
            // 5.点击小圆圈,移动图片 当然移动的是 ul
            // ul的移动距离 小圆圈的索引号 乘以 图片的宽度 注意是负值
            // 当我们点击了某个小li  就拿到当前小li的索引号
            var index = this.getAttribute('index');
            // console.log(focusWidth);
            // console.log(index);
            // 当我们点击了某个小li, 就要把这个小li的索引号给num和circle
            num = index;
            circle = index;
            move(ul, -index * focusWidth);
        })
    }
    // 把ol里面的第一个小li设置类名为 current
    ol.children[0].className = 'current';
    // 6. 克隆第一张图片(li) 放到ul 最后面       加true深克隆 复制里面的子节点  false浅克隆 不复制该节点里面的节点  克隆图片是在创建小圆点后边,不用担心小圆点数量
    var first = ul.children[0].cloneNode(true);
    ul.appendChild(first);                    //放在最后一个孩子
    // 7.点击左侧按钮, 图片滚动一张
    var flag = true;
    // flag 节流阀
    arrow_r.addEventListener('click', function () {
        if (flag){
            flag = false; //关闭节流阀
            if (num === ul.children.length - 1) {    //多一张图片,多一个第一张图片的小li,所以要减一(无缝滚动)
                ul.style.left = '0';
                num = 0;
            }
            num++;
            move(ul, -num * focusWidth,function() {
                flag = true;
            });
            // 8.点击右侧按钮, 小圆圈跟着一起变化,可以再声明一个变量控制小圆圈的播放 (写在鼠标点击右箭头事件里)
            circle++;
            // 如果clircle ==4 说明走到克隆图片了,这时候让他复原
            // if (circle === ol.children.length) {
            //     circle = 0;
            // }
            circle === ol.children.length ? circle = 0 : circle;   // circle=circle === ol.children.length ? circle = 0 : circle;(开头circle=可以省略)
            circleChange();  //调用小圆点当前图片所在个数的颜色函数
        }
    });

    // 左点击滑动图片
    arrow_l.addEventListener('click', function () {
        if (flag){
            flag = false; //关闭节流阀
            if (num === 0) {    // 如果索引号为零,要快速跳到最后一张图,再移动操作
                num = ul.children.length - 1;   //索引号比获得的个数小1
                ul.style.left = 'num * focusWidth';
            }
            num--;  // 索引号再减一,开始调用函数进行动画操作
            move(ul, -num * focusWidth,function () {
                flag = true;
            });
            // 8.点击右侧按钮, 小圆圈跟着一起变化,可以再声明一个变量控制小圆圈的播放 (写在鼠标点击右箭头事件里)
            circle--;
            // 如果clircle ==4 说明走到克隆图片了,这时候让他复原
            // if (circle < 0) {
            //     circle = ol.children.length - 1;
            // }
            circle = circle < 0 ? circle = ol.children.length - 1 : circle;  //三元表达式
            circleChange();  //调用小圆点当前图片所在个数的颜色函数
        }
    });

    function circleChange() {//函数封装
        // 排他思想,干掉所有人
        for (var i = 0; i < ol.children.length; i++) {  // 这个ol的孩子是4, 但是 i<4, i能取0,1,2,3 ,最后一张图片不用加类名也不用改类名
            // console.log(ol.children.length);    //  输出结果就是4
            ol.children[i].className = '';
        }
        // 留下当前的小圆圈的current类名
        ol.children[circle].className = 'current';
    }
    // 10.自动播放轮播图
    var timer = setInterval(function () {
        // 手动调用点击事件
        arrow_r.click();
    },2000);
})