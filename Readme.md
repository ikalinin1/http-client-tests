Use `./gradlew run` to run
Available parametrs:
* `-Durl=` url to sile e.g. https://examples.com
* `-Dusername=` Basic Auth username e.g. username
* `-Dpassword=` Basic Auth username e.g. password
* `-Diterations=` default is 30 how many times repeat request
* `-Dtimeout=` default value 0, timeout between requests in millis

Example:
`./gradlew run -Durl=https://examples.com -Diterations=100 -Dtimeout=1`