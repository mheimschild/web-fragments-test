### Web fragments sample project

This sample project consists of two modules - web and lib

"web" project has a servlet mapped to /test1
"lib" project has a servlet mapped to /test2 and secured by standard servlet security configured only in the "lib" project

After deployment curl http://localhost:8080/test1 returns some data and status code 200
On the other hand curl http://localhost:8080/test2 returns status code 401

# Important files

* web/src/main/webapp/WEB-INF/web.xml - main web descriptor
* lib/src/main/resources/META-INF/web-fragment.xml - web fragment containing security configuration
