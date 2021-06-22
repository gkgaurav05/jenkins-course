job('NodeJS example') {
    scm {
        git('https://github.com/gkgaurav05/jenkins-course.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('gkumar05')
            node / gitConfigEmail('gkumar05@outlook.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('NodeJS 8.0.0') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
