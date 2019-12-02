Get-ChildItem -Force -Recurse
echo `n
$a = Get-ChildItem -Force -Recurse -include *.java

foreach ($line in $a) {
	
    $extn = [IO.Path]::GetExtension($line)
    if ($extn -eq ".java" )
    {
    "Ada file Java pada direktori $line"
    }	
}



