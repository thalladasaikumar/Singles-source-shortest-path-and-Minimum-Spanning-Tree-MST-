@echo off
title Graph Algorithms Minimum Spanning Tree
javac -cp ".;./lib/guava-28.1-jre.jar" MinimumSpanningTree.java Graph.java GraphNode.java Edge.java

echo ------------ input1 ----------------
java -cp ".;./lib/guava-28.1-jre.jar" MinimumSpanningTree input1.txt

echo ------------ input2 ----------------
java -cp ".;./lib/guava-28.1-jre.jar" MinimumSpanningTree input2.txt

echo ------------ input3 ----------------
java -cp ".;./lib/guava-28.1-jre.jar" MinimumSpanningTree input3.txt

pause