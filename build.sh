rm -r build
mkdir build
cd src
javac -d ../build GameFrame.java
cd ../build
java GameFrame
