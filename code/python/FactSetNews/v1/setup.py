"""
    News API

     The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions        # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301
import os

def read(filename):
  return open(os.path.join(os.path.dirname(__file__), filename)).read()

NAME = "fds.sdk.FactSetNews"
VERSION = "0.1.1"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
  "urllib3 >= 1.25.3",
  "python-dateutil",
  "fds.sdk.utils >= 1.0.0",
]

setup(
    name=NAME,
    version=VERSION,
    description="FactSet News client library for Python",
    author="FactSet Research Systems",
    url="https://github.com/FactSet/enterprise-sdk/tree/main/code/python/FactSetNews/v1",
    keywords=["FactSet", "API", "SDK"],
    python_requires=">=3.7",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="Apache License, Version 2.0",
    long_description_content_type="text/markdown",
    long_description=read("README.md")
)
