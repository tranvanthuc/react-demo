#!/bin/sh

echo "Waiting db ready"
./wait-for mongodb:27017

echo "Start app"
npm start