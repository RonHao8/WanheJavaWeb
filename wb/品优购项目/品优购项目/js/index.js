// 轮播图功能
window.addEventListener('load', function () {
    // 获取元素
    var arrow_l = document.querySelector('.arrow-l');
    var arrow_r = document.querySelector('.arrow-r');
    var picture = document.querySelector('.picture');
    var pictureWidth = picture.offsetWidth;


    var ul = picture.querySelector('ul');
    var ol = picture.querySelector('.circle');
    var num = 0;
    var circle = 0;
    for (var i = 0; i < 5; i++) {
        // 获取一个li
        var li = ol.querySelector('li');
        // 记录当前小li的索引号  通过自定义属性来获取
        li.setAttribute('index', i);

        // 点击事件
        li.addEventListener('click', function () {
            // 把所有的小li 清除 current 类名
            for (var i = 0; i < ol.children.length; i++) {
                ol.children[i].className = '';
            }
            //当前的小li 设置current 类名
            this.className = 'current';
            // 5.点击小圆圈,移动图片
            // ul的移动距离 小圆圈的索引号 乘以 图片的宽度 注意是负值
            // 当我们点击了某个小li  就拿到当前小li的索引号
            var index = this.getAttribute('index');
            // 当我们点击了某个小li, 就要把这个小li的索引号给num和circle
            num = index;
            circle = index;
            move(ul, -index * pictureWidth);
        })
    }
    // 点击左侧按钮, 图片滚动一张
    var flag = true;
    arrow_r.addEventListener('click', function () {
        if (flag){
            flag = false;
            if (num === ul.children.length - 1) {    //多一张图片,多一个第一张图片的小li,所以要减一(无缝滚动)
                ul.style.left = '0';
                num = 0;
            }
            num++;
            move(ul, -num * pictureWidth,function() {
                flag = true;
            });
            // 点击右侧按钮, 小圆圈跟着一起变化
            circle++;
            circle === ol.children.length ? circle = 0 : circle;
            circleChange();  //调用小圆点当前图片所在个数的颜色函数
        }
    });

    // 左点击滑动图片
    arrow_l.addEventListener('click', function () {
        if (flag){
            flag = false;
            if (num === 0) {    // 如果索引号为零,要快速跳到最后一张图,再移动操作
                num = ul.children.length - 1;   //索引号比获得的个数小1
                ul.style.left = 'num * pictureWidth';
            }
            num--;  // 索引号再减一,开始调用函数进行动画操作
            move(ul, -num * pictureWidth,function () {
                flag = true;
            });
            // 点击右侧按钮, 小圆圈跟着一起变化
            circle--;
            circle = circle < 0 ? circle = ol.children.length - 1 : circle;  //三元表达式
            circleChange();  //调用小圆点当前图片所在个数的颜色函数
        }
    });

    //小圆圈随着图片的移动而变化
    function circleChange() {
        // 排他思想,干掉所有人
        for (var i = 0; i < ol.children.length; i++) {
            ol.children[i].className = '';
        }
        // 留下当前的小圆圈的current类名
        ol.children[circle].className = 'current';
    }
    // 自动播放轮播图
    var timer = setInterval(function () {
        // 手动调用点击事件
        arrow_r.click();
    },3000);
})


//图片移动
function move(obj, target, callback) {
    // 先清除以前的定时器，只保留当前的一个定时器执行
    clearInterval(obj.timer);
    obj.timer = setInterval(function() {
        // 步长值写到定时器的里面
        // 把我们步长值改为整数 不要出现小数的问题
        var step = (target - obj.offsetLeft) / 10;
        step = step > 0 ? Math.ceil(step) : Math.floor(step);
        if (obj.offsetLeft === target) {
            // 停止动画停止定时器
            clearInterval(obj.timer);

            callback && callback();  // 结果为true, 再执行右边,调用回调函数(短路运算符),为假直接跳过
        }
        // 把每次加1 这个步长值改为一个慢慢变小的值  步长公式：(目标值 - 现在的位置) / 10
        obj.style.left = obj.offsetLeft + step + 'px';

    }, 15);
}