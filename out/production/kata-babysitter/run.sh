#!/usr/bin/env bash
echo "Will now run the baby sitter simulator with default values: \n"
java BabySitter.BabySitterSimulator
echo "\nBaby Sitter simulator: COMPLETE \n\nNow running the basic test suite for the baby sitter classes!\n"
java -cp .:BabySitterTester/* BabySitterTester.TestRunner

