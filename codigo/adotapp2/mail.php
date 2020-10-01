<?php
$name = $_POST['name'];
$email = $_POST['email'];
$message = $_POST['message'];
$subject = $_POST['subject'];
header('Content-Type: application/json');
if ($name === ''){
  print json_encode(array('message' => 'Nome não pode ficar vazio.', 'code' => 0));
  exit();
}
if ($email === ''){
  print json_encode(array('message' => 'Email não pode ficar vazio.', 'code' => 0));
  exit();
}
if ($subject === ''){
  print json_encode(array('message' => 'Assunto não pode ficar vazio.', 'code' => 0));
  exit();
}
if ($message === ''){
  print json_encode(array('message' => 'Conteúdo da mensagem não pode ficar vazio.', 'code' => 0));
  exit();
}
$content="From: $name \nEmail: $email \nMessage: $message";
$recipient = "leo.mvm@hotmail.com";
$mailheader = "From: $email \r\n";
mail($recipient, $subject, $content, $mailheader) or die("Erro!");
print json_encode(array('message' => 'Email enviado!', 'code' => 1));
exit();
?>