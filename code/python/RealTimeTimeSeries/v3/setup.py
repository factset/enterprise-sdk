"""
    Time Series API For Digital Portals

    Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information.   # noqa: E501

    The version of the OpenAPI document: 3.0.0
    Contact: api@factset.com
    Generated by: https://openapi-generator.tech
"""


from setuptools import setup, find_packages  # noqa: H301
import os

def read(filename):
  return open(os.path.join(os.path.dirname(__file__), filename)).read()

NAME = "fds.sdk.RealTimeTimeSeries"
VERSION = "0.11.5"
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
    description="Real-Time Time Series client library for Python",
    author="FactSet Research Systems",
    url="https://github.com/FactSet/enterprise-sdk/tree/main/code/python/RealTimeTimeSeries/v3",
    keywords=["FactSet", "API", "SDK"],
    python_requires=">=3.7",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="Apache License, Version 2.0",
    long_description_content_type="text/markdown",
    long_description=read("README.md")
)
