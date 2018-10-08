
Welcome to your CDK Java project!

It is a Gradle-based project, so you can open this directory with any Gradle-compatible Java IDE,
and you should be able to build and run tests from your IDE.

You should explore the contents of this template. It demonstrates a CDK app with two instances of
a stack (`HelloStack`) which also uses a user-defined construct (`HelloConstruct`).

The `cdk.json` file tells the CDK Toolkit how to execute your app. It uses a script called `app.sh`
to do that. Note that this script expects a fully contained jar to be built, which is created by
```gradlew jar```

# Prerequisites:

https://github.com/awslabs/aws-cdk

* ```npm i -g aws-cdk ``` 

# Useful commands

 * `./gradlew build` compile and run tests
 * `./gradlew jar`   build jar file, required by cdk
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

# Further reading

https://awslabs.github.io/aws-cdk/getting-started.html

Enjoy!

