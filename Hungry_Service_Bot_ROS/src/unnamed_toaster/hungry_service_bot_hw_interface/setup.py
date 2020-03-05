#!/usr/bin/env python

from setuptools import setup
from catkin_pkg.python_setup import generate_distutils_setup

d = generate_distutils_setup(
    packages=['hungry_service_bot_hw_interface'],
    package_dir={'': 'src'})

setup(**d)

