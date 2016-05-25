<?php
$db_name = "MyApp";
$db_usr_name = "root";
$db_pw = "rAcE";
$server_name = "localhost";

$conn = mysqli_connect($server_name,$db_usr_name,$db_pw,$db_name);
$age_string = $_POST["age"];
$age = (int)$age_string;
$mysql_query = "INSERT INTO user_info (id, age) VALUES (NULL, '$age')";

if($conn->query($mysql_query)===TRUE){
	echo "Input Age: ".$age."\nSuccessfully Saved in Database.\n";
}
else echo "data can't inserted successfully\n";
$conn->close();
?>
