Feature: Notes
	Scenario: notes
	Given notes
	
#************* Cucumber ***************************
# Cucumber Options: features, glue(step definitions), tags(segregating tests), format/plugin(report/results), monochrome(displays console in pretty), 
# 				   dryrun(with true it will just check for matching steps, if false will run the tests), strict(looking for any missing step)

# Data driven ways in cucumber(Parameterizing) :
#		1. without Example (Passing directly in step and use regular expression
# 		2. With Example. Need to use Scenario Outline for these. And dat in Examples table with headers.
#		3. Data table to pass data into a step. But no column heading. And no repeated scenarios. Only multiple data to same step.

# Tags: Used to segregate the tests. We can put tags on features and mention them on runner class.e.g. smoketest, regression, end_to_end, etc	
#		->To ignore any tag in runner class, just put like "~@Regression" 

# Hooks: used to set preconditions and post conditions before and after each scenario. Mainly used to initialize config file.
#		-> We use @Before & @After to run something before and after each scenario. We dont need other testng annotations here since we are
#			not running on class level, but using tags or feature level. We used @Before to initialize and @After to close browser.

# Tagged Hooks: If you want to run any precondition mentioned in a separate @Before method before a specific scenario with a tag.
#		e.g. you have a scenario with tag as "@specialCase", and want to have some code in a @Before method, you will call this by having 
#		this tag with the @Before method. Like @Before("@specialCase")
#		Another example, if you want to delete entry before adding new OR delete after adding new in @After("@special")


#************* Jenkins ***************************
# Download Jenkins War file and keep it in Documents folder or anywhere
# Go to this folder in terminal and run --> java -jar jenkins.war
# It will create a password at the end. Now go to localhost:8080 on browser and enter the password to unlock jenkins admin.
# And select Install suggested pluggins
# Create first admin user --> username: dennismail4u & pwd: Test@123
# Now need to install maven pluggins --> Manage Jenkins - Manage Pluggin - Available - Search Maven - select all maven related and install
# Login
# Create item - Enter project name and select Maven Project - Enter description - Under Build, click on tool configuration and click Maven(add maven)
# and give name(anything), Apply and Save
# Note: Look below in bracket place if this doesnt work-->Now under build, enter pom.xml path in Root POM field - eg.  /Users/DennisThomas/Documents/workspace/SeleniumFrameworkProj/pom.xml -- Apply and save
# We need to download report plugin as well. -- Go back to Manage pluggin and install testNG results pluggin
# Now select project and go to configure - Under post build actions, select Publish TestNg results - apply and save
# Now its ready for basic run, just click build now to download all the artifacts and run the pom.xml which is the project itself.

# To find the java installation path in mac -- just run "/usr/libexec/java_home -v 1.8" in terminal --> it will show the path.
# Put this path in the jdk field in jenkins
# For that Go Manage Jenkins - Gloabal Tool Configuration - Under JDK - JDK Name=JDK 8, JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_131.jdk/Contents/Home(From above)
# For setting project path in Jenkins Configure -> Project - Configure - Under Build-> Root POM = SeleniumFrameworkProj/pom.xml
# (Not putting complete path here since it throws error saying doesnt find POM.xml because jenkins looking at a different location. 
# For that go to User - .jenkins - Jobs - Project - Workspace - Project - Code with POM.xml --> If the project is not here, copy the project
# folder to above workspace folder manually and run).

# ************** Git ******************************
# Go to your project folder in terminal
# ls -a   --> Will list all files inside it
# 


