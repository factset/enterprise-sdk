[![FactSet](https://raw.githubusercontent.com/factset/enterprise-sdk/main/docs/images/factset-logo.svg)](https://www.factset.com)

# Vermilion client library for Java

[![API Version](https://img.shields.io/badge/api-v1.0.0-blue)](https://developer.factset.com/api-catalog/vermilion-api)
[![Maven Central](https://img.shields.io/maven-central/v/com.factset.sdk/vermilion/2.3.0)](https://central.sonatype.com/artifact/com.factset.sdk/vermilion/2.3.0)
[![Apache-2 license](https://img.shields.io/badge/license-Apache2-brightgreen.svg)](https://www.apache.org/licenses/LICENSE-2.0)

Documentation on all available end points in the VRSAPI

This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- SDK version: 2.3.0
- Build package: org.openapitools.codegen.languages.JavaClientCodegen

For more information, please visit [https://developer.factset.com/contact](https://developer.factset.com/contact)

## Requirements

* Java JDK >= 1.8

## Installation

### Maven

Add these dependencies to your project's POM:

```xml
<dependency>
  <groupId>com.factset.sdk</groupId>
  <artifactId>utils</artifactId>
  <version>1.1.0</version>
</dependency>
<dependency>
  <groupId>com.factset.sdk</groupId>
  <artifactId>vermilion</artifactId>
  <version>2.3.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle

Add these dependencies to your project's build file:

```groovy
  repositories {
    mavenCentral()
  }

  dependencies {
    implementation "com.factset.sdk:utils:1.1.0"
    implementation "com.factset.sdk:vermilion:2.3.0"
  }
```

## Usage

1. [Generate authentication credentials](../../../../README.md#authentication).
2. Setup Java environment.
   1. Install and activate Java 1.8+
   2. Install [maven](https://maven.apache.org/install.html) or [gradle](https://gradle.org/install/)
3. [Install dependencies](#installation).
4. Run the following:

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

### Example Code

```java
import com.factset.sdk.Vermilion.*;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.DatasourceApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class DatasourceApiExample {

    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        DatasourceApi apiInstance = new DatasourceApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return. Default is 25
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip. Default is 0
        try {
            DataSourceList result = apiInstance.getAllDataSources(tenant, sort, paginationLimit, paginationOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasourceApi#getAllDataSources");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

### Using a Proxy

To add a HTTP proxy for the API client, use `ClientConfig`:
```java

import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import com.factset.sdk.Vermilion.*;
import com.factset.sdk.Vermilion.api.DatasourceApi;

...

ApiClient defaultClient = Configuration.getDefaultApiClient();
ClientConfig clientConfig = defaultClient.getClientConfig();
clientConfig.connectorProvider(new ApacheConnectorProvider());
clientConfig.property(ClientProperties.PROXY_URI, "http://proxy_url_here");
clientConfig.property(ClientProperties.PROXY_USERNAME, "proxy_username");
clientConfig.property(ClientProperties.PROXY_PASSWORD, "proxy_password");
defaultClient.setClientConfig(clientConfig);

DatasourceApi apiInstance = new DatasourceApi(defaultClient);

```

### Debugging
The SDK uses the standard library class [`java.util.logging.Logger`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html).

Calling `setDebugging(true)` on an instance of the `ApiClient` will return an instance of the `ApiClient` that has set the logger's [`Level`](https://docs.oracle.com/javase/7/docs/api/java/util/logging/Level.html) to `ALL`.

**Note**: This prints out sensitive information (e.g. the full request and response). Use with care.

```java
import com.factset.sdk.Vermilion.ApiClient;

public class Main {
    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = new ApiClient();
        defaultClient.setDebugging(true);

        // Setup authentication and make request with apiInstance...
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DatasourceApi* | [**getAllDataSources**](docs/DatasourceApi.md#getAllDataSources) | **GET** /v1/{tenant}/data-sources | Lists all datasources
*DatasourceApi* | [**getDataSourceByCode**](docs/DatasourceApi.md#getDataSourceByCode) | **GET** /v1/{tenant}/data-sources/{dataSourceCode} | Gets a datasource
*DatasourceApi* | [**getDataSourceData**](docs/DatasourceApi.md#getDataSourceData) | **GET** /v1/{tenant}/data-sources/{dataSourceCode}/data | Gets the data for the datasource
*EntityApi* | [**getEntityValuesByCode**](docs/EntityApi.md#getEntityValuesByCode) | **GET** /v1/{tenant}/entities/{entityCode}/values | Gets the entity values
*ReportApi* | [**getAllReportDefinitions**](docs/ReportApi.md#getAllReportDefinitions) | **GET** /v1/{tenant}/reports | Gets all report definitions
*ReportApi* | [**getReportDefinitionByCode**](docs/ReportApi.md#getReportDefinitionByCode) | **GET** /v1/{tenant}/reports/{reportDefinitionCode} | Gets a report definition
*ReportInstanceApi* | [**cancelReportGeneration**](docs/ReportInstanceApi.md#cancelReportGeneration) | **DELETE** /v1/{tenant}/report-instances/{reportInstanceId} | Cancels a report generation
*ReportInstanceApi* | [**downloadReportFile**](docs/ReportInstanceApi.md#downloadReportFile) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/results/{reportFileName} | Gets the generated file
*ReportInstanceApi* | [**getAllReportInstances**](docs/ReportInstanceApi.md#getAllReportInstances) | **GET** /v1/{tenant}/report-instances | Gets a list of report instances
*ReportInstanceApi* | [**getReportGenerationLogs**](docs/ReportInstanceApi.md#getReportGenerationLogs) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/logs | Gets a list of logs for the report instance generation
*ReportInstanceApi* | [**getReportInstanceById**](docs/ReportInstanceApi.md#getReportInstanceById) | **GET** /v1/{tenant}/report-instances/{reportInstanceId} | Gets a report instance based on the ID
*ReportInstanceApi* | [**startReportGeneration**](docs/ReportInstanceApi.md#startReportGeneration) | **POST** /v1/report-instances/generate | Generates a report
*ScimApi* | [**createGroup**](docs/ScimApi.md#createGroup) | **POST** /scim/v2/Groups | Creates a role
*ScimApi* | [**createUser**](docs/ScimApi.md#createUser) | **POST** /scim/v2/Users | Creates a user
*ScimApi* | [**deleteGroupById**](docs/ScimApi.md#deleteGroupById) | **DELETE** /scim/v2/Groups/{groupId} | Deletes a VRS role
*ScimApi* | [**deleteUserById**](docs/ScimApi.md#deleteUserById) | **DELETE** /scim/v2/Users/{userId} | Deletes a VRS user
*ScimApi* | [**getAllGroups**](docs/ScimApi.md#getAllGroups) | **GET** /scim/v2/Groups | Retrieves a list of VRS role
*ScimApi* | [**getAllUsers**](docs/ScimApi.md#getAllUsers) | **GET** /scim/v2/Users | Retrieves a list of VRS users
*ScimApi* | [**getGroupById**](docs/ScimApi.md#getGroupById) | **GET** /scim/v2/Groups/{groupId} | Retrieves a VRS role
*ScimApi* | [**getUserById**](docs/ScimApi.md#getUserById) | **GET** /scim/v2/Users/{userId} | Retrieves a VRS User
*ScimApi* | [**patchGroupById**](docs/ScimApi.md#patchGroupById) | **PATCH** /scim/v2/Groups/{groupId} | Add or remove a user to/from a group
*ScimApi* | [**patchUserById**](docs/ScimApi.md#patchUserById) | **PATCH** /scim/v2/Users/{userId} | Add or remove VRS user attributes
*ScimApi* | [**updateGroupById**](docs/ScimApi.md#updateGroupById) | **PUT** /scim/v2/Groups/{groupId} | Updates a VRS Group
*ScimApi* | [**updateUserById**](docs/ScimApi.md#updateUserById) | **PUT** /scim/v2/Users/{userId} | Updates a VRS user
*VersionApi* | [**getVersion**](docs/VersionApi.md#getVersion) | **GET** /v1/version | Gets the version of VRS,WRS and DBServer
*WorkflowApi* | [**generateSchedule**](docs/WorkflowApi.md#generateSchedule) | **POST** /v1/{tenant}/schedules/{scheduleDefinitionCode} | Creates schedule for the specified schedule definition
*WorkflowApi* | [**generateScheduleTasks**](docs/WorkflowApi.md#generateScheduleTasks) | **POST** /v1/{tenant}/schedules/{scheduleId}/generate-tasks | Generates the tasks for the initialised schedule
*WorkflowApi* | [**getScheduleById**](docs/WorkflowApi.md#getScheduleById) | **GET** /v1/{tenant}/schedules/{scheduleId} | Gets a schedule based on the schedule ID
*WorkflowApi* | [**getScheduleDefinitions**](docs/WorkflowApi.md#getScheduleDefinitions) | **GET** /v1/{tenant}/schedule-definitions | Retrieves a list of all schedule definitions
*WorkflowApi* | [**getScheduleGenerationLogs**](docs/WorkflowApi.md#getScheduleGenerationLogs) | **GET** /v1/{tenant}/schedules/{scheduleId}/logs | Gets the generation logs for a specific schedule
*WorkflowApi* | [**getSchedules**](docs/WorkflowApi.md#getSchedules) | **GET** /v1/{tenant}/schedules | Retrieves a list of all schedules
*WorkflowApi* | [**getTask**](docs/WorkflowApi.md#getTask) | **GET** /v1/{tenant}/tasks/{taskId} | Gets a task based on the task ID
*WorkflowApi* | [**getTaskHistory**](docs/WorkflowApi.md#getTaskHistory) | **GET** /v1/{tenant}/tasks/{taskId}/history | Gets the task history for a specific task
*WorkflowApi* | [**getTasks**](docs/WorkflowApi.md#getTasks) | **GET** /v1/{tenant}/tasks | Retrieves a list of all tasks
*WorkflowApi* | [**updateScheduleStatus**](docs/WorkflowApi.md#updateScheduleStatus) | **PATCH** /v1/{tenant}/schedules/{scheduleId}/{status} | Update schedule status for specified schedule
*WorkflowApi* | [**updateTaskDetails**](docs/WorkflowApi.md#updateTaskDetails) | **PATCH** /v1/{tenant}/tasks/{taskId} | Updates the task details for the specified task.


## Documentation for Models

 - [CreateScimUserJSONRequest](docs/CreateScimUserJSONRequest.md)
 - [CreateScimUserJSONRequestName](docs/CreateScimUserJSONRequestName.md)
 - [CreatedScimUserJSONResponse](docs/CreatedScimUserJSONResponse.md)
 - [CreatedScimUserJSONResponseMeta](docs/CreatedScimUserJSONResponseMeta.md)
 - [DataSourceAllData](docs/DataSourceAllData.md)
 - [DataSourceDTO](docs/DataSourceDTO.md)
 - [DataSourceData](docs/DataSourceData.md)
 - [DataSourceDataInstance](docs/DataSourceDataInstance.md)
 - [DataSourceInstance](docs/DataSourceInstance.md)
 - [DataSourceInstanceRows](docs/DataSourceInstanceRows.md)
 - [DataSourceList](docs/DataSourceList.md)
 - [DataSourceListMeta](docs/DataSourceListMeta.md)
 - [DataSourceListMetaPagination](docs/DataSourceListMetaPagination.md)
 - [EntityDTO](docs/EntityDTO.md)
 - [EntityFieldValueDTO](docs/EntityFieldValueDTO.md)
 - [EntityFieldValueDTOMeta](docs/EntityFieldValueDTOMeta.md)
 - [EntityFieldValueDTOMetaPagination](docs/EntityFieldValueDTOMetaPagination.md)
 - [EntitySelection](docs/EntitySelection.md)
 - [Error](docs/Error.md)
 - [ErrorList](docs/ErrorList.md)
 - [GenerateScheduleResponse](docs/GenerateScheduleResponse.md)
 - [RecordSetFieldValues](docs/RecordSetFieldValues.md)
 - [RecordSetFields](docs/RecordSetFields.md)
 - [ReportDefinitionDTO](docs/ReportDefinitionDTO.md)
 - [ReportDefinitionData](docs/ReportDefinitionData.md)
 - [ReportDefinitionList](docs/ReportDefinitionList.md)
 - [ReportDefinitionListMeta](docs/ReportDefinitionListMeta.md)
 - [ReportDefinitionListMetaPagination](docs/ReportDefinitionListMetaPagination.md)
 - [ReportGenerationRequest](docs/ReportGenerationRequest.md)
 - [ReportGenerationRequestBody](docs/ReportGenerationRequestBody.md)
 - [ReportInstanceDTO](docs/ReportInstanceDTO.md)
 - [ReportInstanceData](docs/ReportInstanceData.md)
 - [ReportInstanceDataResponse](docs/ReportInstanceDataResponse.md)
 - [ReportInstanceId](docs/ReportInstanceId.md)
 - [ReportInstanceList](docs/ReportInstanceList.md)
 - [ReportInstanceListMeta](docs/ReportInstanceListMeta.md)
 - [ReportInstanceListMetaPagination](docs/ReportInstanceListMetaPagination.md)
 - [ReportInstanceLogDTO](docs/ReportInstanceLogDTO.md)
 - [ReportInstanceLogList](docs/ReportInstanceLogList.md)
 - [ReportRevisionDTO](docs/ReportRevisionDTO.md)
 - [ScheduleAPIDTO](docs/ScheduleAPIDTO.md)
 - [ScheduleAPIDTOAllOf](docs/ScheduleAPIDTOAllOf.md)
 - [ScheduleData](docs/ScheduleData.md)
 - [ScheduleDefinition](docs/ScheduleDefinition.md)
 - [ScheduleDefinitionOwnerRole](docs/ScheduleDefinitionOwnerRole.md)
 - [ScheduleDefinitionsList](docs/ScheduleDefinitionsList.md)
 - [ScheduleDefinitionsListMeta](docs/ScheduleDefinitionsListMeta.md)
 - [ScheduleDefinitionsListMetaPagination](docs/ScheduleDefinitionsListMetaPagination.md)
 - [ScheduleGenerationLog](docs/ScheduleGenerationLog.md)
 - [ScheduleGenerationLogList](docs/ScheduleGenerationLogList.md)
 - [ScheduleGenerationLogListMeta](docs/ScheduleGenerationLogListMeta.md)
 - [ScheduleGenerationLogListMetaPagination](docs/ScheduleGenerationLogListMetaPagination.md)
 - [ScheduleInstanceData](docs/ScheduleInstanceData.md)
 - [ScheduleResponseData](docs/ScheduleResponseData.md)
 - [ScheduleStatusUpdateResponse](docs/ScheduleStatusUpdateResponse.md)
 - [SchedulesList](docs/SchedulesList.md)
 - [SchedulesListMeta](docs/SchedulesListMeta.md)
 - [SchedulesListMetaPagination](docs/SchedulesListMetaPagination.md)
 - [ScimEmail](docs/ScimEmail.md)
 - [ScimError](docs/ScimError.md)
 - [ScimGroup](docs/ScimGroup.md)
 - [ScimGroupListResponse](docs/ScimGroupListResponse.md)
 - [ScimGroupMember](docs/ScimGroupMember.md)
 - [ScimGroupPatchOperation](docs/ScimGroupPatchOperation.md)
 - [ScimGroupPatchOperationValue](docs/ScimGroupPatchOperationValue.md)
 - [ScimGroupPatchRequestBody](docs/ScimGroupPatchRequestBody.md)
 - [ScimMeta](docs/ScimMeta.md)
 - [ScimPhone](docs/ScimPhone.md)
 - [ScimPhoto](docs/ScimPhoto.md)
 - [ScimUser](docs/ScimUser.md)
 - [ScimUserGroup](docs/ScimUserGroup.md)
 - [ScimUserListResponse](docs/ScimUserListResponse.md)
 - [ScimUserName](docs/ScimUserName.md)
 - [ScimUserPatchOperation](docs/ScimUserPatchOperation.md)
 - [ScimUserPatchRequestBody](docs/ScimUserPatchRequestBody.md)
 - [TaskDetails](docs/TaskDetails.md)
 - [TaskDetailsObject](docs/TaskDetailsObject.md)
 - [TaskHistoryList](docs/TaskHistoryList.md)
 - [TaskHistoryListMeta](docs/TaskHistoryListMeta.md)
 - [TaskHistoryListMetaPagination](docs/TaskHistoryListMetaPagination.md)
 - [TaskHistoryObject](docs/TaskHistoryObject.md)
 - [TaskList](docs/TaskList.md)
 - [TaskListItemDetails](docs/TaskListItemDetails.md)
 - [TaskListItemDetailsAllOf](docs/TaskListItemDetailsAllOf.md)
 - [TaskListMeta](docs/TaskListMeta.md)
 - [TaskListMetaPagination](docs/TaskListMetaPagination.md)
 - [TaskPatchRequestBody](docs/TaskPatchRequestBody.md)
 - [TaskPatchRequestBodyData](docs/TaskPatchRequestBodyData.md)
 - [TaskPatchResponse](docs/TaskPatchResponse.md)
 - [TaskPatchResponseObject](docs/TaskPatchResponseObject.md)
 - [Tenancy](docs/Tenancy.md)
 - [VersionResponseBody](docs/VersionResponseBody.md)
 - [VersionResponseBodyData](docs/VersionResponseBodyData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### FactSetApiKey


- **Type**: HTTP basic authentication

### FactSetOAuth2


- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multi-threaded environment to avoid any potential issues.

# Contributing

Please refer to the [contributing guide](../../../../CONTRIBUTING.md).

# Copyright

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
