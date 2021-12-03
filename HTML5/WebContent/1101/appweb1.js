/**
 * Created by blart on 2016/11/1.
 */
function zjsj(id) {
    var data = document.getElementById(id).value;//获取输入的内容
    var time = new Date().getTime();//获取时间
    localStorage.setItem(time,data);//储存到localStorage 的键值对
    alert("数据已保存")//显示提示
    load('msg');
}
function load(id) {//输出记录
    var  result = "<table border = '1'>";
    for(var i = 0;i<localStorage.length;i++){//遍历出所有的key
        var key = localStorage.key(i);//取出key的值
        var value = localStorage.getItem(key);//通过key显示value
        var date = new Date();//获取时间
        date.setTime(key);//设置时间
        result +="<tr><td>"+value+"</td><td>"+date+"</td></tr>"//输出格式
    }
    result += "</table>";
    var  target = document.getElementById(id);
    target.innerHTML = result;
function qcsj() {
    localStorage.clear();
    alert("数据已经清除!");
    load('msg');

}
}