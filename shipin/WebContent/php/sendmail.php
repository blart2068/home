<?php 
    require_once "Smtp.class.php"; 
    //******************** ������Ϣ ******************************** 
    $smtpserver = "ssl://smtp.aliyun.com";//SMTP������ 
    $smtpserverport =465;//SMTP�������˿� 
    $smtpusermail = "���Լ��İ������ʻ�@aliyun.com";//SMTP���������û����� 
    $smtpemailto = $_POST['toemail'];//���͸�˭ 
    $smtpuser = "���Լ��İ������ʻ�@aliyun.com";//SMTP���������û��ʺţ�ע����������ֻ��@ǰ����û��� 
    $smtppass = "���氢�����ʻ���Ӧ������";//SMTP���������û����� 
    $mailtitle = $_POST['title'];//�ʼ����� 
    $mailcontent = "<h1>".$_POST['content']."</h1>";//�ʼ����� 
    $mailtype = "HTML";//�ʼ���ʽ��HTML/TXT��,TXTΪ�ı��ʼ� 
    //************************ ������Ϣ **************************** 
    $smtp = new Smtp($smtpserver,$smtpserverport,true,$smtpuser,$smtppass);//�������һ��true�Ǳ�ʾʹ�������֤,����ʹ�������֤. 
    $smtp->debug = false;//�Ƿ���ʾ���͵ĵ�����Ϣ 
    $state = $smtp->sendmail($smtpemailto, $smtpusermail, $mailtitle, $mailcontent, $mailtype); 
 
    if($state==""){ 
        echo "�Բ����ʼ�����ʧ�ܣ�����������д�Ƿ�����"; 
        exit(); 
    } 
    echo "��ϲ���ʼ����ͳɹ�����"; 
?>