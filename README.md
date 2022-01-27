<img alt="FactSet" src="https://www.factset.com/hubfs/Assets/images/factset-logo.svg" height="56" width="290">

# FactSet Enterprise SDK

[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

This repository contains auto-generated client libraries in .NET, Java, Python and TypeScript/JavaScript for all of FactSet's APIs published on the [Developer Portal](https://developer.factset.com). The client library code is generated using the [openapi-generator](https://github.com/OpenAPITools/openapi-generator).

## Overview

All of the source code for the API client libraries can be found in the `code/` directory, which contains language-specific sub-directories and API-specific sub-directories under each language (e.g. `code/python/PAEngine`). Each API client library also depends on a shared utility library that provides common functionality, like authentication helpers.

| **Language**          | **Client libraries**                                                                                  | **Utility library**                                                                |
| --------------------- | ----------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| .NET                  | [.NET source](https://github.com/factset/enterprise-sdk/tree/master/code/dotnet)                      | [.NET utilities](https://github.com/factset/enterprise-sdk-utils-dotnet)           |
| Java                  | [Java source](https://github.com/factset/enterprise-sdk/tree/master/code/java)                        | [Java utilities](https://github.com/factset/enterprise-sdk-utils-java)             |
| Python                | [Python source](https://github.com/factset/enterprise-sdk/tree/master/code/python)                    | [Python utilities](https://github.com/factset/enterprise-sdk-utils-python)         |
| TypeScript/JavaScript | [TypeScript/JavaScript source](https://github.com/factset/enterprise-sdk/tree/master/code/typescript) | [TypeScript utilities](https://github.com/factset/enterprise-sdk-utils-typescript) |

### Definitions

* **Software Development Kit (SDK)** - A programming-language-specific group of client libraries that a FactSet customer can use to programmatically access FactSet content and analytics.
* **Client library** - a programming-language-specific module that contains a grouping of related logic.  Each SDK is made up of one or more client libraries.  When implementing an application or service that depends on FactSet APIs, a customer would leverage one or more client libraries.
* **Package** - a client library that has been built for distribution to customers, often through a package manager like PyPi, Maven Central, NuGet or NPM.
* **Semantic Versioning** - a common [specification](https://semver.org/) for versioning software, where a version number looks like `MAJOR.MINOR.PATCH` (e.g. `1.2.3`).
    * **MAJOR** - incremented when there is a breaking change, like changing a response type adding a new required parameter or changing status codes.
    * **MINOR** - incremented when functionality is added in a backward compatible way, like adding a new endpoint, adding new optional query string arguments or adding a new optional property to the request body.
    * **PATCH** - incremented when a backwards-compatible bug fix is added, like fixing a typo in documentation.

## Usage

Each API and utility library is published as its own package to the following package managers:

* .NET - [NuGet](https://www.nuget.org/) (`FactSet.SDK` prefix)
* Java - [Maven](https://search.maven.org/) (`com.factset.sdk` group ID)
* Python - [PyPI](https://pypi.org/) (`fds.sdk` prefix)
* TypeScript/JavaScript - [npm](https://www.npmjs.com/) (`@fds/sdk` prefix)

The [samples repository](https://github.com/factset/enterprise-sdk-samples) contains sample code for working with the SDK in various languages and is a good starting point. Each library linked above in the [overview](#overview) section also contains embedded sample code to help with getting started.

## Contributing

Please refer to the [contributing guide](CONTRIBUTING.md).

## Copyright

Copyright 2021 FactSet Research Systems Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
