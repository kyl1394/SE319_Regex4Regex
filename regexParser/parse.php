<?php

    $file = fopen( "fileIO/statement.in", "w" );
    fwrite( $file, $_GET['generator']);
    fclose($file);
    
    $grun = "java org.antlr.v4.runtime.misc.TestRig ";


    shell_exec($grun." regexParser start < fileIO/statement.in > fileIO/regex.out");

    $file = fopen( "fileIO/regex.out", "r" );
    $filesize = filesize( "fileIO/regex.out" );
    $filetext = fread( $file, $filesize );
    fclose($file);
    
    echo json_encode(
        
        array(      
            'regex' => htmlspecialchars($filetext)
        )
    ); 


?>