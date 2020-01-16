xcopy "AST*.java" "./backup" /Y
jjtree parser2.jjt && javacc parser2.jj && javac.exe *.java && java JavaParser %*
xcopy "./backup/AST*.java" "." /Y