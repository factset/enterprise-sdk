"""
    Best Execution Analytics for Smarter Trading (BEAST) API

    Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.  # noqa: E501

    The version of the OpenAPI document: 2.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301
import os

def read(filename):
  return open(os.path.join(os.path.dirname(__file__), filename)).read()

NAME = "fds.sdk.BestExecutionAnalyticsforSmarterTradingBEAST"
VERSION = "0.2.1"
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
    description="Best Execution Analytics for Smarter Trading (BEAST) client library for Python",
    author="FactSet Research Systems",
    url="https://github.com/FactSet/enterprise-sdk/tree/main/code/python/BestExecutionAnalyticsforSmarterTradingBEAST/v2",
    keywords=["FactSet", "API", "SDK"],
    python_requires=">=3.7",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="Apache License, Version 2.0",
    long_description_content_type="text/markdown",
    long_description=read("README.md")
)
