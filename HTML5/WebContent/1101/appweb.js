/**
 * Created by blart on 2016/11/1.
 */
//sessionStorage鍑芥暟涓存椂淇濆瓨鍏抽棴娴忚鍣ㄥ悗鑷姩娓呴櫎
function saveStorage(id) {//淇濆瓨鐩爣鏁版嵁
    var target = document.getElementById(id);//閫氳繃id鑾峰彇鐩爣鏂囦欢
    var str = target.value;//鑾峰彇鍐呭
    //淇濆瓨鏁版嵁鐨勬柟娉�,閫氳繃閿�煎 key value
    sessionStorage.setItem("message",str);
}
function loadStorage(id) {//鑾峰彇鐩爣
    var target = document.getElementById(id);//鑾峰彇鐩爣鏂囦欢
    var msg = sessionStorage.getItem("message");//閫氳繃key 鑾峰彇value
    target.innerHTML = msg;

}
// localStorage鍑芥暟姘镐箙淇濆瓨 闇�瑕佹墜鍔ㄦ竻闄ゆ祻瑙堝櫒鏁版嵁鏀舵秷澶�
// function saveStorage(id) {
//     var target = document.getElementsByTagName(id);
//     var str = target.value;
//     localStorage.setItem("message1",str);
// }
// function loadStorage(id) {
//     var target = document.getElementById(id);
//     var msg1 = localStorage.getItem("message1");
//     target.innerHTML = msg1;
// }
