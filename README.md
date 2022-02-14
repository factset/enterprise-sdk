<img alt="FactSet" src="https://www.factset.com/hubfs/Assets/images/factset-logo.svg" height="56" width="290">

# FactSet Enterprise SDK

[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

The FactSet Enterprise SDK is a collection of client libraries designed to make it easier to use [FactSet's APIs](https://developer.factset.com/api-catalog) in .NET, Java, Python and TypeScript/JavaScript (Node.js). For more information on what APIs are available and how to subscribe, please see the [Developer Portal](https://developer.factset.com/).

## Overview

The FactSet Enterprise SDK is made up of two main components, API client libraries and utility libraries. The API client libraries are auto-generated for .NET, Java, Python and TypeScript/JavaScript using the [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator) based on the OpenAPI specifications published on the [Developer Portal](https://developer.factset.com/). Whereas the utility libraries are handwritten and contain shared functionality that spans all APIs, such as authentication logic.

The auto-generated source code for the API client libraries can be found in the `code/` directory of this repository, which contains language-specific sub-directories and API-specific sub-directories under each language (e.g. `code/python/PAEngine`).

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

* .NET - [NuGet](https://www.nuget.org/packages?q=FactSet.SDK) (`FactSet.SDK` prefix)
* Java - [Maven](https://search.maven.org/search?q=com.factset.sdk) (`com.factset.sdk` group ID)
* Python - [PyPI](https://pypi.org/search/?q=%22fds.sdk%22) (`fds.sdk` prefix)
* TypeScript/JavaScript - [npm](https://www.npmjs.com/~enterprisesdk) (`@factset/sdk` prefix)

Each library linked above in the [overview](#overview) section also contains embedded sample code to help with getting started.

## Authentication

The FactSet Enterprise SDK supports two forms of authentication, both must be setup through [FactSet's Developer Portal](https://developer.factset.com).

1. (preferred) OAuth 2.0 - client credentials flow
2. API Key

### OAuth 2.0

[OAuth 2.0](https://github.com/factset/oauth2-guidelines) is the preferred authentication scheme when using FactSet's APIs and this SDK. Right now the SDK supports the client credentials flow, which can be used for machine-to-machine communication.

#### Client Credentials Flow

Follow these steps to register an application on FactSet's Developer Portal and create an OAuth 2.0 client:

1. Open the [applications](https://developer.factset.com/applications) page on FactSet's Developer Portal.
2. Click `Create Application` then `Confidential Client Application`. This will create a new OAuth 2.0 client that uses the client credentials flow.
3. Enter the application details:
   * Name: enter anything that you would like
   * Description: enter anything that you would like
   * Signing Key: select `Generate a key pair`
      * **NOTE:** while FactSet does not store your generated private key, for production deployments you should generate your own key pair and only share the public key with FactSet by selecting the `Use my own public key` option to ensure that your private key remains secure.
4. Click `Create`, then on the next screen click `Download` to download the configuration.
5. Move the downloaded configuration file to somewhere that's accessible to your application and name it `app-config.json`.

### API Key

Follow these steps to create an API key on FactSet's Developer Portal:

1. Open the [manage API keys](https://developer.factset.com/manage-api-keys) page on FactSet's Developer Portal.
2. Click `Generate new API key`.
3. Enter the API key details:
   * Description: enter anything you would like
   * IP Range: The `From IP` field will be populated with your current Internet-facing IP address. Click the `Add` button to add it to the list, or enter an alternate IP address range based on where your application is executed.
4. Click `Create`.
5. When the success message box pops up, copy your username (FactSet username-serial) and password (API key) somewhere safe to be used later.

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
