"""
    Real-Time Options API

    The Options API provides detailed information for option contracts (“options”) and option classes. This API presents a consolidated data model that gives access to options data of global options markets such as OPRA, Australia Exchange, Bovespa, CME Group, EUREX, Euronext, Hong Kong, ICE Futures Europe / US, Montreal Exchange, and others.  An option class is a product group of options from the same exchange and with the same underlying. The API includes endpoints to retrieve fundamental data for an option contract such as exercise right, exercise style, strike, maturity, open interest, underlying, etc. as well as risk measures of an option contract such as delta, omega, implied volatility, etc.  Option chains are provided by the /by-class/list endpoint. The list of option contracts for an option class can be filtered by exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The option screener allows you to search for option classes by using text search, root symbol, or ISIN plus additional criteria such as market, underlying, currency, and category. Similar to other screener endpoints in e.g. the [Stocks API](https://developer.factset.com/api-catalog/stocks-api-digital-portals), the /value-ranges/get endpoint provides the possible values and value ranges plus the number of option contracts for an option class related to the option contracts per criteria such as exercise right, exercise style, strike, maturity, open interest, delta, omega, implied volatility, etc.  The Options API for Digital Portals seamlessly integrates with the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) that provides real-time, delayed, and end-of-day pricing data and basic security identifier cross-reference. For direct access to price histories for charting, please refer to the [Real-Time Time Series API](https://developer.factset.com/api-catalog/real-time-time-series-api).   # noqa: E501

    The version of the OpenAPI document: 4.1.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301
import os

def read(filename):
  return open(os.path.join(os.path.dirname(__file__), filename)).read()

NAME = "fds.sdk.RealTimeOptions"
VERSION = "0.1.0"
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
    description="Real-Time Options client library for Python",
    author="FactSet Research Systems",
    url="https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeOptions/v4",
    keywords=["FactSet", "API", "SDK"],
    python_requires=">=3.7",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="Apache License, Version 2.0",
    long_description_content_type="text/markdown",
    long_description=read("README.md")
)
