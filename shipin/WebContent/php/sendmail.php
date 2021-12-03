<?php 
    require_once "Smtp.class.php"; 
    //******************** 配置信息 ******************************** 
    $smtpserver = "ssl://smtp.aliyun.com";//SMTP服务器 
    $smtpserverport =465;//SMTP服务器端口 
    $smtpusermail = "你自己的阿里云帐户@aliyun.com";//SMTP服务器的用户邮箱 
    $smtpemailto = $_POST['toemail'];//发送给谁 
    $smtpuser = "你自己的阿里云帐户@aliyun.com";//SMTP服务器的用户帐号，注：部分邮箱只需@前面的用户名 
    $smtppass = "上面阿里云帐户对应的密码";//SMTP服务器的用户密码 
    $mailtitle = $_POST['title'];//邮件主题 
    $mailcontent = "<h1>".$_POST['content']."</h1>";//邮件内容 
    $mailtype = "HTML";//邮件格式（HTML/TXT）,TXT为文本邮件 
    //************************ 配置信息 **************************** 
    $smtp = new Smtp($smtpserver,$smtpserverport,true,$smtpuser,$smtppass);//这里面的一个true是表示使用身份验证,否则不使用身份验证. 
    $smtp->debug = false;//是否显示发送的调试信息 
    $state = $smtp->sendmail($smtpemailto, $smtpusermail, $mailtitle, $mailcontent, $mailtype); 
 
    if($state==""){ 
        echo "对不起，邮件发送失败！请检查邮箱填写是否有误。"; 
        exit(); 
    } 
    echo "恭喜！邮件发送成功！！"; 
?>