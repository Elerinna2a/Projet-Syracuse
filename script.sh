#!/bin/bash

min=${1:-18}
max=${2:-50}

javac Syracuse.java

for i in $(seq $min $max); do
    java Syracuse $i
    tail -n 2 f$i.dat | head -n 1 | cut -d "=" -f 2 >> altMax.dat
    tail -n 1 f$i.dat | head -n 1 | cut -d "=" -f 2 >> dureeVol.dat
    # tail -n 2 f$i.dat | head -n 1 | cut -c 14-17 >> altMax.dat
    # tail -n 1 f$i.dat | head -n 1 | cut -c 14-16 >> dureeVol.dat
done
rm f*.dat