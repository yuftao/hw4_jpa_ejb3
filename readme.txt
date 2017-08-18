how to start the database:
use cdm and switch the folder to the project folder
run:
java -classpath lib\hsqldb.jar org.hsqldb.Server


how to build project:
use cmd and switch the folder to the project folder
run: ant && ant run


how to open the clien ui:
start the database
use cmd and switch the folder to the project folder
java -cp lib\hsqldb.jar org.hsqldb.util.DatabaseManager 