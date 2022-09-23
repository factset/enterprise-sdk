<img alt="FactSet" src="https://www.factset.com/hubfs/Assets/images/factset-logo.svg" height="56" width="290">

# FactSet Enterprise SDK

[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The FactSet Enterprise SDK is a collection of client libraries designed to make it easier to use [FactSet's APIs](https://developer.factset.com/api-catalog) in .NET, Java, Python and TypeScript/JavaScript (Node.js). For more information on what APIs are available and how to subscribe, please see the [Developer Portal](https://developer.factset.com/).

## Overview

The FactSet Enterprise SDK is made up of two main components, API client libraries and utility libraries. The API client libraries are auto-generated for .NET, Java, Python and TypeScript/JavaScript using the [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator) based on the OpenAPI specifications published on the [Developer Portal](https://developer.factset.com/). Whereas the utility libraries are handwritten and contain shared functionality that spans all APIs, such as authentication logic.

The auto-generated source code for the API client libraries can be found in the `code/` directory of this repository, which contains language-specific sub-directories and API-specific sub-directories under each language (e.g. `code/python/PAEngine`).

| **Language**          | **Client libraries**                                                                                  | **Utility library**                                                                |
| --------------------- | ----------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| .NET                  | [.NET source](https://github.com/factset/enterprise-sdk/tree/main/code/dotnet)                      | [.NET utilities](https://github.com/factset/enterprise-sdk-utils-dotnet)           |
| Java                  | [Java source](https://github.com/factset/enterprise-sdk/tree/main/code/java)                        | [Java utilities](https://github.com/factset/enterprise-sdk-utils-java)             |
| Python                | [Python source](https://github.com/factset/enterprise-sdk/tree/main/code/python)                    | [Python utilities](https://github.com/factset/enterprise-sdk-utils-python)         |
| TypeScript/JavaScript | [TypeScript/JavaScript source](https://github.com/factset/enterprise-sdk/tree/main/code/typescript) | [TypeScript utilities](https://github.com/factset/enterprise-sdk-utils-typescript) |

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

* .NET - [NuGet](https://www.nuget.org/packages?q=FactSet.SDK) (`FactSet.SDK` prefix)
* Java - [Maven](https://search.maven.org/search?q=com.factset.sdk) (`com.factset.sdk` group ID)
* Python - [PyPI](https://pypi.org/search/?q=%22fds.sdk%22) (`fds.sdk` prefix)
* TypeScript/JavaScript - [npm](https://www.npmjs.com/~enterprisesdk) (`@factset/sdk` prefix)

Each library linked above in the [overview](#overview) section also contains embedded sample code to help with getting started.

## Authentication

The FactSet Enterprise SDK supports two forms of authentication, both must be setup through [FactSet's Developer Portal](https://developer.factset.com).

1. (preferred) [OAuth 2.0](https://developer.factset.com/learn/authentication-oauth2) - client credentials flow
2. [API Key](https://developer.factset.com/learn/authentication-api-key)

## Contributing

Please refer to the [contributing guide](CONTRIBUTING.md).

## Copyright

Copyright 2022 FactSet Research Systems Inc

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
