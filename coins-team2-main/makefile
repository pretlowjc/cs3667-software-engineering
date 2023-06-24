JUNIT5_JAR = junit-platform-console-standalone-1.2.0.jar
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher
CKSTYLE_COMMAND =  -jar checkstyle-5.5-all.jar

default:
	@echo "4 available targets:"
	@echo "    compile - builds codebase"
	@echo "    clean - removes .class files and tmpfiles"
	@echo "    test - runs JUnit5 tests"
	@echo "    check - runs checkstyle"

compile: $(JUNIT5_JAR)
	javac -cp .:$(JUNIT5_JAR) *.java
	
clean:
	rm -f *~
	rm -f *.class
	
check:
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Coin.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml CoinMint.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Demo.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml USDCoinMint.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Dime.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Dollar.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml HalfDollar.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Nickel.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Penny.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Quarter.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml FiftyPence.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml FivePence.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml FivePound.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml GBPCoinMint.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Pence.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml Pound.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml TenPence.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml TwentyPence.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml TwoPence.java
	java $(CKSTYLE_COMMAND) -c ./mystyle.xml TwoPound.java
	
test: $(JUNIT5_JAR)
	java -cp .:$(JUNIT5_JAR) $(JUNIT5_RUNNER) --scan-class-path

demo: Demo.class
	java Demo
