#!/usr/bin/env sh
# Short script that clone natives libs git repos and build the libs.

sudo -v || exit

LIB_DIR="."
WORK_DIR="WORKING_DIR"

rm -r -f $WORK_DIR
mkdir -p $WORK_DIR

# ToxCore lib build
cd $WORK_DIR
#rm -r -f toxcore
git clone https://github.com/irungentoo/toxcore.git
cd toxcore
autoreconf -i
./configure
make
sudo make install
cd ../..

mkdir -p $LIB_DIR
cp /usr/local/lib/libtoxcore.so $LIB_DIR/libtoxcore.so

# JToxcore binding building
cd $WORK_DIR
rm -r -f jToxcore
git clone https://github.com/Tox/jToxcore.git
cd jToxcore
mkdir build
cd build
cmake ..
make

cd ../../..
cp --remove-destination $WORK_DIR/jToxcore/build/jni/libjtoxcore.so $LIB_DIR/libjtoxcore.so
cp --remove-destination $WORK_DIR/jToxcore/build/src/jToxcore.jar $LIB_DIR/jToxcore.jar

# and clean up
rm -r -f $WORK_DIR

