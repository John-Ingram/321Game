rm -r build
mkdir build
cd src
javac -d ../build Renderer.java
cd ../build
java Renderer