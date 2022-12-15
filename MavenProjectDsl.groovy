jon("First-Maven-Project-Via-DSL"){
    description("First Maven Job gennerated  by DSL on ${new Date()}, this is simple maven project")


    scm{
        git("https://github.com/kashivirus/java-sample.git" , 'main')
    }

    triggers{
        scm("* * * * *")
    }

    steps{
        maven("clean package", 'maven-samples/single-module/pom.xml')
    }

    publishers{
        archiveArtifacts "**/*.jar"
    }
}