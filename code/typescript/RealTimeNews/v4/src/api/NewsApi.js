/**
 * Real-Time News API
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/real-time-quotes-api), [time series](https://developer.factset.com/api-catalog/real-time-time-series-api), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Real-Time Quotes API](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
 *
 * The version of the OpenAPI document: 4.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import InlineResponse20043 from '../model/InlineResponse20043';
import InlineResponse20044 from '../model/InlineResponse20044';
import InlineResponse20045 from '../model/InlineResponse20045';
import InlineResponse20046 from '../model/InlineResponse20046';
import InlineResponse20047 from '../model/InlineResponse20047';
import InlineResponse20048 from '../model/InlineResponse20048';
import InlineResponse20049 from '../model/InlineResponse20049';
import InlineResponse20050 from '../model/InlineResponse20050';
import InlineResponse20051 from '../model/InlineResponse20051';
import InlineResponse20052 from '../model/InlineResponse20052';
import InlineResponse20053 from '../model/InlineResponse20053';
import InlineResponse20054 from '../model/InlineResponse20054';
import InlineResponse20055 from '../model/InlineResponse20055';
import InlineResponse20056 from '../model/InlineResponse20056';
import InlineResponse20057 from '../model/InlineResponse20057';
import PostNewsArticleListByChainRequest from '../model/PostNewsArticleListByChainRequest';
import PostNewsArticleListByIndexRequest from '../model/PostNewsArticleListByIndexRequest';
import PostNewsArticleListByInstrumentRequest from '../model/PostNewsArticleListByInstrumentRequest';
import PostNewsArticleListByMediaKindRequest from '../model/PostNewsArticleListByMediaKindRequest';
import PostNewsArticleListRequest from '../model/PostNewsArticleListRequest';
import PostNewsArticleSearchByTextRequest from '../model/PostNewsArticleSearchByTextRequest';
import PostNewsPublisherSearchByNameRequest from '../model/PostNewsPublisherSearchByNameRequest';

/**
* News service.
* @module api/NewsApi
*/
export default class NewsApi {

    /**
    * Constructs a new NewsApi. 
    * @alias module:api/NewsApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Details for a news article.
     * Details for a news article.
     * @param {String} code Identifier of a news article.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.includeMedia If true, media references are included if available. (default to false)
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {String} opts.metaLanguage ISO 639-1 code of the language.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20043} and HTTP response
     */
    getNewsArticleGetWithHttpInfo(code, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'code' is set
      if (code === undefined || code === null) {
        throw new Error("Missing the required parameter 'code' when calling getNewsArticleGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'code': code,
        'includeMedia': opts['includeMedia'],
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        'metaLanguage': opts['metaLanguage']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20043;

      return this.apiClient.callApi(
        '/news/article/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Details for a news article.
     * Details for a news article.
     * @param {String} code Identifier of a news article.
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.includeMedia If true, media references are included if available. (default to false)
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {String} opts.metaLanguage ISO 639-1 code of the language.
     * @return { Promise.< module:model/InlineResponse20043 > } a Promise, with data of type {@link module:model/InlineResponse20043 }
     */
    getNewsArticleGet(code, opts) {
      return this.getNewsArticleGetWithHttpInfo(code, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Details for a news article type.
     * Details for a news article type.
     * @param {Number} id Identifier of a news article type.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {String} opts.metaLanguage ISO 639-1 code of the language.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20050} and HTTP response
     */
    getNewsArticleTypeGetWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getNewsArticleTypeGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        'metaLanguage': opts['metaLanguage']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20050;

      return this.apiClient.callApi(
        '/news/article/type/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Details for a news article type.
     * Details for a news article type.
     * @param {Number} id Identifier of a news article type.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {String} opts.metaLanguage ISO 639-1 code of the language.
     * @return { Promise.< module:model/InlineResponse20050 > } a Promise, with data of type {@link module:model/InlineResponse20050 }
     */
    getNewsArticleTypeGet(id, opts) {
      return this.getNewsArticleTypeGetWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List of news article types.
     * List of news article types.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {String} opts.metaLanguage ISO 639-1 code of the language.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20051} and HTTP response
     */
    getNewsArticleTypeListWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        'metaLanguage': opts['metaLanguage']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20051;

      return this.apiClient.callApi(
        '/news/article/type/list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * List of news article types.
     * List of news article types.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {String} opts.metaLanguage ISO 639-1 code of the language.
     * @return { Promise.< module:model/InlineResponse20051 > } a Promise, with data of type {@link module:model/InlineResponse20051 }
     */
    getNewsArticleTypeList(opts) {
      return this.getNewsArticleTypeListWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Details of a distributor.
     * Details of a distributor.
     * @param {Number} id Identifier of a distributor.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20052} and HTTP response
     */
    getNewsDistributorGetWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getNewsDistributorGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20052;

      return this.apiClient.callApi(
        '/news/distributor/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Details of a distributor.
     * Details of a distributor.
     * @param {Number} id Identifier of a distributor.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return { Promise.< module:model/InlineResponse20052 > } a Promise, with data of type {@link module:model/InlineResponse20052 }
     */
    getNewsDistributorGet(id, opts) {
      return this.getNewsDistributorGetWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List of distributors.
     * List of distributors.
     * @param {Object} opts Optional parameters
     * @param {Array.<Number>} opts.ids Identifiers of distributors.
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {Array.<module:model/String>} opts.sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |  
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20053} and HTTP response
     */
    getNewsDistributorListWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(opts['ids'], 'csv'),
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        '_sort': this.apiClient.buildCollectionParam(opts['sort'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20053;

      return this.apiClient.callApi(
        '/news/distributor/list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * List of distributors.
     * List of distributors.
     * @param {Object} opts Optional parameters
     * @param {Array.<Number>} opts.ids Identifiers of distributors.
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {Array.<module:model/String>} opts.sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |  
     * @return { Promise.< module:model/InlineResponse20053 > } a Promise, with data of type {@link module:model/InlineResponse20053 }
     */
    getNewsDistributorList(opts) {
      return this.getNewsDistributorListWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Details of a publisher.
     * Details of a publisher.
     * @param {Number} id Identifier of a publisher.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20054} and HTTP response
     */
    getNewsPublisherGetWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getNewsPublisherGet");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20054;

      return this.apiClient.callApi(
        '/news/publisher/get', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Details of a publisher.
     * Details of a publisher.
     * @param {Number} id Identifier of a publisher.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @return { Promise.< module:model/InlineResponse20054 > } a Promise, with data of type {@link module:model/InlineResponse20054 }
     */
    getNewsPublisherGet(id, opts) {
      return this.getNewsPublisherGetWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List of publishers.
     * List of publishers.
     * @param {Object} opts Optional parameters
     * @param {Array.<Number>} opts.ids Identifiers of publishers.
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {Array.<module:model/String>} opts.sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |  
     * @param {Number} opts.paginationOffset Non-negative number of entries to skip, or 0 (default). (default to 0)
     * @param {Number} opts.paginationLimit Non-negative maximum number of entries to return. (default to 20)
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20055} and HTTP response
     */
    getNewsPublisherListWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'ids': this.apiClient.buildCollectionParam(opts['ids'], 'csv'),
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        '_sort': this.apiClient.buildCollectionParam(opts['sort'], 'csv'),
        '_paginationOffset': opts['paginationOffset'],
        '_paginationLimit': opts['paginationLimit']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20055;

      return this.apiClient.callApi(
        '/news/publisher/list', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * List of publishers.
     * List of publishers.
     * @param {Object} opts Optional parameters
     * @param {Array.<Number>} opts.ids Identifiers of publishers.
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {Array.<module:model/String>} opts.sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |  
     * @param {Number} opts.paginationOffset Non-negative number of entries to skip, or 0 (default). (default to 0)
     * @param {Number} opts.paginationLimit Non-negative maximum number of entries to return. (default to 20)
     * @return { Promise.< module:model/InlineResponse20055 > } a Promise, with data of type {@link module:model/InlineResponse20055 }
     */
    getNewsPublisherList(opts) {
      return this.getNewsPublisherListWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List of publishers provided by the given distributor.
     * List of publishers provided by the given distributor.
     * @param {Number} id Identifier of a distributor.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {Array.<module:model/String>} opts.sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |  
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20056} and HTTP response
     */
    getNewsPublisherListByDistributorWithHttpInfo(id, opts) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getNewsPublisherListByDistributor");
      }

      let pathParams = {
      };
      let queryParams = {
        'id': id,
        '_attributes': this.apiClient.buildCollectionParam(opts['attributes'], 'csv'),
        '_sort': this.apiClient.buildCollectionParam(opts['sort'], 'csv')
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = [];
      let accepts = ['application/json'];


      let returnType = InlineResponse20056;

      return this.apiClient.callApi(
        '/news/publisher/list-by-distributor', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * List of publishers provided by the given distributor.
     * List of publishers provided by the given distributor.
     * @param {Number} id Identifier of a distributor.
     * @param {Object} opts Optional parameters
     * @param {Array.<String>} opts.attributes Limit the attributes returned in the response to the specified set.
     * @param {Array.<module:model/String>} opts.sort Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |  
     * @return { Promise.< module:model/InlineResponse20056 > } a Promise, with data of type {@link module:model/InlineResponse20056 }
     */
    getNewsPublisherListByDistributor(id, opts) {
      return this.getNewsPublisherListByDistributorWithHttpInfo(id, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List of news articles.
     * List of news articles.
     * @param {Object} opts Optional parameters
     * @param {module:model/PostNewsArticleListRequest} opts.postNewsArticleListRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20044} and HTTP response
     */
    postNewsArticleListWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['postNewsArticleListRequest'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = InlineResponse20044;

      return this.apiClient.callApi(
        '/news/article/list', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * List of news articles.
     * List of news articles.
     * @param {Object} opts Optional parameters
     * @param {module:model/PostNewsArticleListRequest} opts.postNewsArticleListRequest Request Body
     * @return { Promise.< module:model/InlineResponse20044 > } a Promise, with data of type {@link module:model/InlineResponse20044 }
     */
    postNewsArticleList(opts) {
      return this.postNewsArticleListWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List news articles of an article chain.
     * List news articles of an article chain.
     * @param {module:model/PostNewsArticleListByChainRequest} postNewsArticleListByChainRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20045} and HTTP response
     */
    postNewsArticleListByChainWithHttpInfo(postNewsArticleListByChainRequest) {
      let postBody = postNewsArticleListByChainRequest;
      // verify the required parameter 'postNewsArticleListByChainRequest' is set
      if (postNewsArticleListByChainRequest === undefined || postNewsArticleListByChainRequest === null) {
        throw new Error("Missing the required parameter 'postNewsArticleListByChainRequest' when calling postNewsArticleListByChain");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = InlineResponse20045;

      return this.apiClient.callApi(
        '/news/article/list-by-chain', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * List news articles of an article chain.
     * List news articles of an article chain.
     * @param {module:model/PostNewsArticleListByChainRequest} postNewsArticleListByChainRequest Request Body
     * @return { Promise.< module:model/InlineResponse20045 > } a Promise, with data of type {@link module:model/InlineResponse20045 }
     */
    postNewsArticleListByChain(postNewsArticleListByChainRequest) {
      return this.postNewsArticleListByChainWithHttpInfo(postNewsArticleListByChainRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * News articles for instruments that are constituents of the given indices.
     * News articles for instruments that are constituents of the given indices.
     * @param {module:model/PostNewsArticleListByIndexRequest} postNewsArticleListByIndexRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20046} and HTTP response
     */
    postNewsArticleListByIndexWithHttpInfo(postNewsArticleListByIndexRequest) {
      let postBody = postNewsArticleListByIndexRequest;
      // verify the required parameter 'postNewsArticleListByIndexRequest' is set
      if (postNewsArticleListByIndexRequest === undefined || postNewsArticleListByIndexRequest === null) {
        throw new Error("Missing the required parameter 'postNewsArticleListByIndexRequest' when calling postNewsArticleListByIndex");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = InlineResponse20046;

      return this.apiClient.callApi(
        '/news/article/list-by-index', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * News articles for instruments that are constituents of the given indices.
     * News articles for instruments that are constituents of the given indices.
     * @param {module:model/PostNewsArticleListByIndexRequest} postNewsArticleListByIndexRequest Request Body
     * @return { Promise.< module:model/InlineResponse20046 > } a Promise, with data of type {@link module:model/InlineResponse20046 }
     */
    postNewsArticleListByIndex(postNewsArticleListByIndexRequest) {
      return this.postNewsArticleListByIndexWithHttpInfo(postNewsArticleListByIndexRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * News articles for instruments.
     * News articles for instruments.
     * @param {module:model/PostNewsArticleListByInstrumentRequest} postNewsArticleListByInstrumentRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20047} and HTTP response
     */
    postNewsArticleListByInstrumentWithHttpInfo(postNewsArticleListByInstrumentRequest) {
      let postBody = postNewsArticleListByInstrumentRequest;
      // verify the required parameter 'postNewsArticleListByInstrumentRequest' is set
      if (postNewsArticleListByInstrumentRequest === undefined || postNewsArticleListByInstrumentRequest === null) {
        throw new Error("Missing the required parameter 'postNewsArticleListByInstrumentRequest' when calling postNewsArticleListByInstrument");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = InlineResponse20047;

      return this.apiClient.callApi(
        '/news/article/list-by-instrument', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * News articles for instruments.
     * News articles for instruments.
     * @param {module:model/PostNewsArticleListByInstrumentRequest} postNewsArticleListByInstrumentRequest Request Body
     * @return { Promise.< module:model/InlineResponse20047 > } a Promise, with data of type {@link module:model/InlineResponse20047 }
     */
    postNewsArticleListByInstrument(postNewsArticleListByInstrumentRequest) {
      return this.postNewsArticleListByInstrumentWithHttpInfo(postNewsArticleListByInstrumentRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * List news articles which contain media of specific media kinds.
     * List news articles which contain media of specific media kinds.
     * @param {module:model/PostNewsArticleListByMediaKindRequest} postNewsArticleListByMediaKindRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20048} and HTTP response
     */
    postNewsArticleListByMediaKindWithHttpInfo(postNewsArticleListByMediaKindRequest) {
      let postBody = postNewsArticleListByMediaKindRequest;
      // verify the required parameter 'postNewsArticleListByMediaKindRequest' is set
      if (postNewsArticleListByMediaKindRequest === undefined || postNewsArticleListByMediaKindRequest === null) {
        throw new Error("Missing the required parameter 'postNewsArticleListByMediaKindRequest' when calling postNewsArticleListByMediaKind");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = InlineResponse20048;

      return this.apiClient.callApi(
        '/news/article/list-by-media-kind', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * List news articles which contain media of specific media kinds.
     * List news articles which contain media of specific media kinds.
     * @param {module:model/PostNewsArticleListByMediaKindRequest} postNewsArticleListByMediaKindRequest Request Body
     * @return { Promise.< module:model/InlineResponse20048 > } a Promise, with data of type {@link module:model/InlineResponse20048 }
     */
    postNewsArticleListByMediaKind(postNewsArticleListByMediaKindRequest) {
      return this.postNewsArticleListByMediaKindWithHttpInfo(postNewsArticleListByMediaKindRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Search for news articles using a fulltext search.
     * Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; \"include\" requires the criterion to evaluate to true, \"exclude\" requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.
     * @param {Object} opts Optional parameters
     * @param {module:model/PostNewsArticleSearchByTextRequest} opts.postNewsArticleSearchByTextRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20049} and HTTP response
     */
    postNewsArticleSearchByTextWithHttpInfo(opts) {
      opts = opts || {};
      let postBody = opts['postNewsArticleSearchByTextRequest'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = InlineResponse20049;

      return this.apiClient.callApi(
        '/news/article/search-by-text', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Search for news articles using a fulltext search.
     * Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; \"include\" requires the criterion to evaluate to true, \"exclude\" requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.
     * @param {Object} opts Optional parameters
     * @param {module:model/PostNewsArticleSearchByTextRequest} opts.postNewsArticleSearchByTextRequest Request Body
     * @return { Promise.< module:model/InlineResponse20049 > } a Promise, with data of type {@link module:model/InlineResponse20049 }
     */
    postNewsArticleSearchByText(opts) {
      return this.postNewsArticleSearchByTextWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Search for publishers.
     * Search for publishers by the name of the publisher.
     * @param {module:model/PostNewsPublisherSearchByNameRequest} postNewsPublisherSearchByNameRequest Request Body
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse20057} and HTTP response
     */
    postNewsPublisherSearchByNameWithHttpInfo(postNewsPublisherSearchByNameRequest) {
      let postBody = postNewsPublisherSearchByNameRequest;
      // verify the required parameter 'postNewsPublisherSearchByNameRequest' is set
      if (postNewsPublisherSearchByNameRequest === undefined || postNewsPublisherSearchByNameRequest === null) {
        throw new Error("Missing the required parameter 'postNewsPublisherSearchByNameRequest' when calling postNewsPublisherSearchByName");
      }

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['FactSetApiKey', 'FactSetOAuth2'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];


      let returnType = InlineResponse20057;

      return this.apiClient.callApi(
        '/news/publisher/search-by-name', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null
      );
    }

    /**
     * Search for publishers.
     * Search for publishers by the name of the publisher.
     * @param {module:model/PostNewsPublisherSearchByNameRequest} postNewsPublisherSearchByNameRequest Request Body
     * @return { Promise.< module:model/InlineResponse20057 > } a Promise, with data of type {@link module:model/InlineResponse20057 }
     */
    postNewsPublisherSearchByName(postNewsPublisherSearchByNameRequest) {
      return this.postNewsPublisherSearchByNameWithHttpInfo(postNewsPublisherSearchByNameRequest)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


}





