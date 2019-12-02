Get-ChildItem -Force -Recurse
echo `n
$a = Get-ChildItem -Force -Recurse -include *.java

foreach ($line in $a) {
	
    $extn = [IO.Path]::GetExtension($line)
    if ($extn -eq ".java" )
    {
    "Ada file Java pada direktori $line"
    
	$i = Read-Host 'diganti namanya (y/t)?'
	if($i -eq "y" -or $i -eq "Y"){
		$name = Read-Host 'masukkan nama baru: '
		Rename-Item -Path $line -NewName $name
	}
    if($i -eq "t" -or $i -eq "T"){
	continue
    }
    else{
    
continue

        }
     }
    	
}



