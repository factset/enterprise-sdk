/**
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request. With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p><p><b>Rate limit is set to 10 requests per second</b>.</p>    Methodology Guide link:   [https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d](https://open.factset.com/api/public/media/download/products/documents/8ca33e81-a7da-4d77-a8cf-2b3a2e868b3d)    
 *
 * The version of the OpenAPI document: 2.10.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ErrorResponse from '../model/ErrorResponse';
import PeopleDecisionsResponse from '../model/PeopleDecisionsResponse';
import PeopleTaskResponse from '../model/PeopleTaskResponse';
import PeopleTaskStatusResponse from '../model/PeopleTaskStatusResponse';

/**
* PeopleMatchBulk service.
* @module api/PeopleMatchBulkApi
*/
export default class PeopleMatchBulkApi {

    /**
    * Constructs a new PeopleMatchBulkApi. 
    * @alias module:api/PeopleMatchBulkApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Get the decisions of matches for the requested taskId.
     * Retrieves the `Decision` objects for an People Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the `universeId` specified in the input file. 
     * @param {Number} taskId Concordance Task Identifier. The taskId is created in response from the /people-task endpoint.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleDecisionsResponse} and HTTP response
     */
    getPeopleDecisionsWithHttpInfo(taskId, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'taskId' is set
      if (taskId === undefined || taskId === null) {
        throw new Error("Missing the required parameter 'taskId' when calling getPeopleDecisions");
      }

      let pathParams = {
      };
      let queryParams = {
        'taskId': taskId,
        'offset': opts['offset'],
        'limit': opts['limit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json;charset=utf-8', 'application/json'];


      let returnType = PeopleDecisionsResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/people-decisions', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get the decisions of matches for the requested taskId.
     * Retrieves the `Decision` objects for an People Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the `universeId` specified in the input file. 
     * @param {Number} taskId Concordance Task Identifier. The taskId is created in response from the /people-task endpoint.
     * @param {Object} opts Optional parameters
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @return { Promise.< module:model/PeopleDecisionsResponse > } a Promise, with data of type {@link module:model/PeopleDecisionsResponse }
     */
    getPeopleDecisions(taskId, opts) {
      return this.getPeopleDecisionsWithHttpInfo(taskId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Create a People Concordance Task.
     * The \"Bulk\" workflow allows the user to create a People Concordance Task. Uploading of a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and creation of a task id is mandatory to start the process. [Concordance Sample People Template](https://my.apps.factset.com/oa/cms/oaAttachment/8bd62c75-8f78-48c0-a27d-9cd186c9a54a/27317)    The taskId is then used for reference in the /people-task-status and /people-decisions endpoints to receive results once the task is successful.The /people-task-status endpoint is to check the status of the Tasks as per the ids.     A universeId must be included in request. If you do not have a universe created, reference the /universe endpoint.The bulk workflow supports a two way approach for the user.   **The user can use these parameters in the following ways.**     1.Filling all the required fields including the `personNameColumn`.(do not include `firstNameColumn`,`lastNameColumn` & `middleNameColumn`)     2.Filling all the required fields excluding the `personNameColumn`.(Ensure atleast the `lastNameColumn` is filled) 
     * @param {Number} universeId The id of the universe that entities should be mapped to. Reference the `/universe` endpoint to create a universe, or view available universes via `/universes`.
     * @param {String} taskName User defined name for the task that will be used to name the output files.
     * @param {File} inputFile The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
     * @param {String} clientIdColumn Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
     * @param {String} entityColumn Header name of the column in the input file that contains the Entity Name to be matched. 
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.additionalContextColumns Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records. 
     * @param {String} opts.firstNameColumn First name of the person.**Do not include with `personNameColumn`**.  
     * @param {String} opts.lastNameColumn Lat name of the person.**Do not include with `personNameColumn`**. 
     * @param {String} opts.middleNameColumn Middle name of the person.**Do not include within `personNameColumn`**. 
     * @param {String} opts.personNameColumn Header name of the column in the input file that contains the name of the person to be matched. **Do not include with `firstNameColumn` and `lastNameColumn`.** 
     * @param {String} opts.priorityColumn Priority associated to the clientId. Used for manual mapping. 
     * @param {String} opts.salutationColumn The salutation of the person.**Do not include with `personNameColumn`**. 
     * @param {String} opts.suffixColumn A name suffix, that follows a person's full name and provides additional information about the person.**Do not include with `personNameColumn`**. 
     * @param {Boolean} opts.autoRemap When `true`, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.** 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleTaskResponse} and HTTP response
     */
    getPeopleTaskForListWithHttpInfo(universeId, taskName, inputFile, clientIdColumn, entityColumn, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'universeId' is set
      if (universeId === undefined || universeId === null) {
        throw new Error("Missing the required parameter 'universeId' when calling getPeopleTaskForList");
      }
      // verify the required parameter 'taskName' is set
      if (taskName === undefined || taskName === null) {
        throw new Error("Missing the required parameter 'taskName' when calling getPeopleTaskForList");
      }
      // verify the required parameter 'inputFile' is set
      if (inputFile === undefined || inputFile === null) {
        throw new Error("Missing the required parameter 'inputFile' when calling getPeopleTaskForList");
      }
      // verify the required parameter 'clientIdColumn' is set
      if (clientIdColumn === undefined || clientIdColumn === null) {
        throw new Error("Missing the required parameter 'clientIdColumn' when calling getPeopleTaskForList");
      }
      // verify the required parameter 'entityColumn' is set
      if (entityColumn === undefined || entityColumn === null) {
        throw new Error("Missing the required parameter 'entityColumn' when calling getPeopleTaskForList");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
        'universeId': universeId,
        'taskName': taskName,
        'inputFile': inputFile,
        'clientIdColumn': clientIdColumn,
        'additionalContextColumns': this.apiClient.buildCollectionParam(opts['additionalContextColumns'], 'csv'),
        'entityColumn': entityColumn,
        'firstNameColumn': opts['firstNameColumn'],
        'lastNameColumn': opts['lastNameColumn'],
        'middleNameColumn': opts['middleNameColumn'],
        'personNameColumn': opts['personNameColumn'],
        'priorityColumn': opts['priorityColumn'],
        'salutationColumn': opts['salutationColumn'],
        'suffixColumn': opts['suffixColumn'],
        'autoRemap': opts['autoRemap']
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['multipart/form-data'];
      let accepts = ['application/json;charset=utf-8', 'application/json'];


      let returnType = PeopleTaskResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/people-task', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Create a People Concordance Task.
     * The \"Bulk\" workflow allows the user to create a People Concordance Task. Uploading of a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and creation of a task id is mandatory to start the process. [Concordance Sample People Template](https://my.apps.factset.com/oa/cms/oaAttachment/8bd62c75-8f78-48c0-a27d-9cd186c9a54a/27317)    The taskId is then used for reference in the /people-task-status and /people-decisions endpoints to receive results once the task is successful.The /people-task-status endpoint is to check the status of the Tasks as per the ids.     A universeId must be included in request. If you do not have a universe created, reference the /universe endpoint.The bulk workflow supports a two way approach for the user.   **The user can use these parameters in the following ways.**     1.Filling all the required fields including the `personNameColumn`.(do not include `firstNameColumn`,`lastNameColumn` & `middleNameColumn`)     2.Filling all the required fields excluding the `personNameColumn`.(Ensure atleast the `lastNameColumn` is filled) 
     * @param {Number} universeId The id of the universe that entities should be mapped to. Reference the `/universe` endpoint to create a universe, or view available universes via `/universes`.
     * @param {String} taskName User defined name for the task that will be used to name the output files.
     * @param {File} inputFile The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
     * @param {String} clientIdColumn Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
     * @param {String} entityColumn Header name of the column in the input file that contains the Entity Name to be matched. 
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.additionalContextColumns Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records. 
     * @param {String} opts.firstNameColumn First name of the person.**Do not include with `personNameColumn`**.  
     * @param {String} opts.lastNameColumn Lat name of the person.**Do not include with `personNameColumn`**. 
     * @param {String} opts.middleNameColumn Middle name of the person.**Do not include within `personNameColumn`**. 
     * @param {String} opts.personNameColumn Header name of the column in the input file that contains the name of the person to be matched. **Do not include with `firstNameColumn` and `lastNameColumn`.** 
     * @param {String} opts.priorityColumn Priority associated to the clientId. Used for manual mapping. 
     * @param {String} opts.salutationColumn The salutation of the person.**Do not include with `personNameColumn`**. 
     * @param {String} opts.suffixColumn A name suffix, that follows a person's full name and provides additional information about the person.**Do not include with `personNameColumn`**. 
     * @param {Boolean} opts.autoRemap When `true`, automatically re-evaluates and overwrites existing mappings using updated metadata submitted in this task. Applicable when the specified universe has auto-remap set to true. **Caution: Mapping updates cannot be undone.** 
     * @return { Promise.< module:model/PeopleTaskResponse > } a Promise, with data of type {@link module:model/PeopleTaskResponse }
     */
    getPeopleTaskForList(universeId, taskName, inputFile, clientIdColumn, entityColumn, opts) {
      return this.getPeopleTaskForListWithHttpInfo(universeId, taskName, inputFile, clientIdColumn, entityColumn, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Get the Status of the People Tasks.
     * Pulls the **status** for ALL the People Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.<p>Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /people-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.taskId Concordance Task Identifier. The taskId is created in response from the /people-task endpoint.
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @param {Array.<module:model/String>} opts.status Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PeopleTaskStatusResponse} and HTTP response
     */
    getPeopleTaskStatusWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'taskId': opts['taskId'],
        'offset': opts['offset'],
        'limit': opts['limit'],
        'status': this.apiClient.buildCollectionParam(opts['status'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json;charset=utf-8', 'application/json'];


      let returnType = PeopleTaskStatusResponse;

      return this.apiClient.callApi(
        '/factset-concordance/v2/people-task-status', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Get the Status of the People Tasks.
     * Pulls the **status** for ALL the People Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.<p>Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /people-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.taskId Concordance Task Identifier. The taskId is created in response from the /people-task endpoint.
     * @param {Number} opts.offset Starting row for records to return or rows to skip. (default to 0)
     * @param {Number} opts.limit Limits the number of records in the response.
     * @param {Array.<module:model/String>} opts.status Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 
     * @return { Promise.< module:model/PeopleTaskStatusResponse > } a Promise, with data of type {@link module:model/PeopleTaskStatusResponse }
     */
    getPeopleTaskStatus(opts) {
      return this.getPeopleTaskStatusWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





