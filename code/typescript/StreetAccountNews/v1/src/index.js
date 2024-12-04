/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.   **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Create, Status, and Get.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import AcceptedResponse from './model/AcceptedResponse';
import CreateFilesRequest from './model/CreateFilesRequest';
import CreateFilesRequestObject from './model/CreateFilesRequestObject';
import CreateOrEditViewBody from './model/CreateOrEditViewBody';
import CreateOrEditViewBodyData from './model/CreateOrEditViewBodyData';
import CreateOrEditViewTickers from './model/CreateOrEditViewTickers';
import CreateViewResponse from './model/CreateViewResponse';
import CreateViewResponseData from './model/CreateViewResponseData';
import DateTimeRangeObject from './model/DateTimeRangeObject';
import DeleteViewBody from './model/DeleteViewBody';
import DeleteViewBodyData from './model/DeleteViewBodyData';
import Error from './model/Error';
import ErrorObject from './model/ErrorObject';
import FilterCategoriesResponse from './model/FilterCategoriesResponse';
import FilterCategoriesResponseData from './model/FilterCategoriesResponseData';
import FilterRegionsResponse from './model/FilterRegionsResponse';
import FilterRegionsResponseData from './model/FilterRegionsResponseData';
import FilterResponse from './model/FilterResponse';
import FilterResponseData from './model/FilterResponseData';
import FilterSectorsResponse from './model/FilterSectorsResponse';
import FilterSectorsResponseData from './model/FilterSectorsResponseData';
import FilterTopicResponse from './model/FilterTopicResponse';
import FilterTopicResponseData from './model/FilterTopicResponseData';
import FilterWatchlistsResponse from './model/FilterWatchlistsResponse';
import FilterWatchlistsResponseData from './model/FilterWatchlistsResponseData';
import FlattenedFilters from './model/FlattenedFilters';
import FlattenedFiltersCategories from './model/FlattenedFiltersCategories';
import FlattenedFiltersCategoriesObject from './model/FlattenedFiltersCategoriesObject';
import FlattenedFiltersRegions from './model/FlattenedFiltersRegions';
import FlattenedFiltersRegionsObject from './model/FlattenedFiltersRegionsObject';
import FlattenedFiltersSectors from './model/FlattenedFiltersSectors';
import FlattenedFiltersSectorsObject from './model/FlattenedFiltersSectorsObject';
import FlattenedFiltersTopics from './model/FlattenedFiltersTopics';
import FlattenedFiltersTopicsObject from './model/FlattenedFiltersTopicsObject';
import FlattenedFiltersWatchlists from './model/FlattenedFiltersWatchlists';
import FlattenedFiltersWatchlistsObject from './model/FlattenedFiltersWatchlistsObject';
import Getfiles from './model/Getfiles';
import GetfilesResponse from './model/GetfilesResponse';
import HeadlinesRequest from './model/HeadlinesRequest';
import HeadlinesRequestByView from './model/HeadlinesRequestByView';
import HeadlinesRequestByViewData from './model/HeadlinesRequestByViewData';
import HeadlinesRequestByViewMeta from './model/HeadlinesRequestByViewMeta';
import HeadlinesRequestData from './model/HeadlinesRequestData';
import HeadlinesRequestDataSearchTime from './model/HeadlinesRequestDataSearchTime';
import HeadlinesRequestMeta from './model/HeadlinesRequestMeta';
import HeadlinesRequestMetaPagination from './model/HeadlinesRequestMetaPagination';
import HeadlinesRequestTickersObject from './model/HeadlinesRequestTickersObject';
import HeadlinesResponse from './model/HeadlinesResponse';
import HeadlinesResponseMeta from './model/HeadlinesResponseMeta';
import HeadlinesResponseMetaPagination from './model/HeadlinesResponseMetaPagination';
import MetaOne from './model/MetaOne';
import Model202ErrorObject from './model/Model202ErrorObject';
import PaginationOne from './model/PaginationOne';
import QuickAlertsBody from './model/QuickAlertsBody';
import QuickAlertsBodyData from './model/QuickAlertsBodyData';
import QuickAlertsResponse from './model/QuickAlertsResponse';
import SearchResponseArrayObject from './model/SearchResponseArrayObject';
import StatusOne from './model/StatusOne';
import StructuredFilters from './model/StructuredFilters';
import StructuredFiltersCategories from './model/StructuredFiltersCategories';
import StructuredFiltersCategoriesObject from './model/StructuredFiltersCategoriesObject';
import StructuredFiltersChildrenObjectCategories from './model/StructuredFiltersChildrenObjectCategories';
import StructuredFiltersChildrenObjectRegions from './model/StructuredFiltersChildrenObjectRegions';
import StructuredFiltersChildrenObjectSectors from './model/StructuredFiltersChildrenObjectSectors';
import StructuredFiltersChildrenObjectTopics from './model/StructuredFiltersChildrenObjectTopics';
import StructuredFiltersRegions from './model/StructuredFiltersRegions';
import StructuredFiltersRegionsObject from './model/StructuredFiltersRegionsObject';
import StructuredFiltersSectors from './model/StructuredFiltersSectors';
import StructuredFiltersSectorsObject from './model/StructuredFiltersSectorsObject';
import StructuredFiltersTopics from './model/StructuredFiltersTopics';
import StructuredFiltersTopicsObject from './model/StructuredFiltersTopicsObject';
import StructuredFiltersWatchlists from './model/StructuredFiltersWatchlists';
import StructuredFiltersWatchlistsObject from './model/StructuredFiltersWatchlistsObject';
import SubmittedResponse from './model/SubmittedResponse';
import Views from './model/Views';
import ViewsObject from './model/ViewsObject';

import FiltersApi from './api/FiltersApi';
import HeadlinesApi from './api/HeadlinesApi';
import StreetAccountHistoricalStoriesApi from './api/StreetAccountHistoricalStoriesApi';
import GetStatusDataResponseWrapper from './api/StreetAccountHistoricalStoriesApi';
import ViewsApi from './api/ViewsApi';


/**
* StreetAccount News client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var streetaccountnews = require('index'); // See note below*.
* var xxxSvc = new streetaccountnews.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new streetaccountnews.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new streetaccountnews.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new streetaccountnews.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The AcceptedResponse model constructor.
     * @property {module:model/AcceptedResponse}
     */
    AcceptedResponse,

    /**
     * The CreateFilesRequest model constructor.
     * @property {module:model/CreateFilesRequest}
     */
    CreateFilesRequest,

    /**
     * The CreateFilesRequestObject model constructor.
     * @property {module:model/CreateFilesRequestObject}
     */
    CreateFilesRequestObject,

    /**
     * The CreateOrEditViewBody model constructor.
     * @property {module:model/CreateOrEditViewBody}
     */
    CreateOrEditViewBody,

    /**
     * The CreateOrEditViewBodyData model constructor.
     * @property {module:model/CreateOrEditViewBodyData}
     */
    CreateOrEditViewBodyData,

    /**
     * The CreateOrEditViewTickers model constructor.
     * @property {module:model/CreateOrEditViewTickers}
     */
    CreateOrEditViewTickers,

    /**
     * The CreateViewResponse model constructor.
     * @property {module:model/CreateViewResponse}
     */
    CreateViewResponse,

    /**
     * The CreateViewResponseData model constructor.
     * @property {module:model/CreateViewResponseData}
     */
    CreateViewResponseData,

    /**
     * The DateTimeRangeObject model constructor.
     * @property {module:model/DateTimeRangeObject}
     */
    DateTimeRangeObject,

    /**
     * The DeleteViewBody model constructor.
     * @property {module:model/DeleteViewBody}
     */
    DeleteViewBody,

    /**
     * The DeleteViewBodyData model constructor.
     * @property {module:model/DeleteViewBodyData}
     */
    DeleteViewBodyData,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The ErrorObject model constructor.
     * @property {module:model/ErrorObject}
     */
    ErrorObject,

    /**
     * The FilterCategoriesResponse model constructor.
     * @property {module:model/FilterCategoriesResponse}
     */
    FilterCategoriesResponse,

    /**
     * The FilterCategoriesResponseData model constructor.
     * @property {module:model/FilterCategoriesResponseData}
     */
    FilterCategoriesResponseData,

    /**
     * The FilterRegionsResponse model constructor.
     * @property {module:model/FilterRegionsResponse}
     */
    FilterRegionsResponse,

    /**
     * The FilterRegionsResponseData model constructor.
     * @property {module:model/FilterRegionsResponseData}
     */
    FilterRegionsResponseData,

    /**
     * The FilterResponse model constructor.
     * @property {module:model/FilterResponse}
     */
    FilterResponse,

    /**
     * The FilterResponseData model constructor.
     * @property {module:model/FilterResponseData}
     */
    FilterResponseData,

    /**
     * The FilterSectorsResponse model constructor.
     * @property {module:model/FilterSectorsResponse}
     */
    FilterSectorsResponse,

    /**
     * The FilterSectorsResponseData model constructor.
     * @property {module:model/FilterSectorsResponseData}
     */
    FilterSectorsResponseData,

    /**
     * The FilterTopicResponse model constructor.
     * @property {module:model/FilterTopicResponse}
     */
    FilterTopicResponse,

    /**
     * The FilterTopicResponseData model constructor.
     * @property {module:model/FilterTopicResponseData}
     */
    FilterTopicResponseData,

    /**
     * The FilterWatchlistsResponse model constructor.
     * @property {module:model/FilterWatchlistsResponse}
     */
    FilterWatchlistsResponse,

    /**
     * The FilterWatchlistsResponseData model constructor.
     * @property {module:model/FilterWatchlistsResponseData}
     */
    FilterWatchlistsResponseData,

    /**
     * The FlattenedFilters model constructor.
     * @property {module:model/FlattenedFilters}
     */
    FlattenedFilters,

    /**
     * The FlattenedFiltersCategories model constructor.
     * @property {module:model/FlattenedFiltersCategories}
     */
    FlattenedFiltersCategories,

    /**
     * The FlattenedFiltersCategoriesObject model constructor.
     * @property {module:model/FlattenedFiltersCategoriesObject}
     */
    FlattenedFiltersCategoriesObject,

    /**
     * The FlattenedFiltersRegions model constructor.
     * @property {module:model/FlattenedFiltersRegions}
     */
    FlattenedFiltersRegions,

    /**
     * The FlattenedFiltersRegionsObject model constructor.
     * @property {module:model/FlattenedFiltersRegionsObject}
     */
    FlattenedFiltersRegionsObject,

    /**
     * The FlattenedFiltersSectors model constructor.
     * @property {module:model/FlattenedFiltersSectors}
     */
    FlattenedFiltersSectors,

    /**
     * The FlattenedFiltersSectorsObject model constructor.
     * @property {module:model/FlattenedFiltersSectorsObject}
     */
    FlattenedFiltersSectorsObject,

    /**
     * The FlattenedFiltersTopics model constructor.
     * @property {module:model/FlattenedFiltersTopics}
     */
    FlattenedFiltersTopics,

    /**
     * The FlattenedFiltersTopicsObject model constructor.
     * @property {module:model/FlattenedFiltersTopicsObject}
     */
    FlattenedFiltersTopicsObject,

    /**
     * The FlattenedFiltersWatchlists model constructor.
     * @property {module:model/FlattenedFiltersWatchlists}
     */
    FlattenedFiltersWatchlists,

    /**
     * The FlattenedFiltersWatchlistsObject model constructor.
     * @property {module:model/FlattenedFiltersWatchlistsObject}
     */
    FlattenedFiltersWatchlistsObject,

    /**
     * The Getfiles model constructor.
     * @property {module:model/Getfiles}
     */
    Getfiles,

    /**
     * The GetfilesResponse model constructor.
     * @property {module:model/GetfilesResponse}
     */
    GetfilesResponse,

    /**
     * The HeadlinesRequest model constructor.
     * @property {module:model/HeadlinesRequest}
     */
    HeadlinesRequest,

    /**
     * The HeadlinesRequestByView model constructor.
     * @property {module:model/HeadlinesRequestByView}
     */
    HeadlinesRequestByView,

    /**
     * The HeadlinesRequestByViewData model constructor.
     * @property {module:model/HeadlinesRequestByViewData}
     */
    HeadlinesRequestByViewData,

    /**
     * The HeadlinesRequestByViewMeta model constructor.
     * @property {module:model/HeadlinesRequestByViewMeta}
     */
    HeadlinesRequestByViewMeta,

    /**
     * The HeadlinesRequestData model constructor.
     * @property {module:model/HeadlinesRequestData}
     */
    HeadlinesRequestData,

    /**
     * The HeadlinesRequestDataSearchTime model constructor.
     * @property {module:model/HeadlinesRequestDataSearchTime}
     */
    HeadlinesRequestDataSearchTime,

    /**
     * The HeadlinesRequestMeta model constructor.
     * @property {module:model/HeadlinesRequestMeta}
     */
    HeadlinesRequestMeta,

    /**
     * The HeadlinesRequestMetaPagination model constructor.
     * @property {module:model/HeadlinesRequestMetaPagination}
     */
    HeadlinesRequestMetaPagination,

    /**
     * The HeadlinesRequestTickersObject model constructor.
     * @property {module:model/HeadlinesRequestTickersObject}
     */
    HeadlinesRequestTickersObject,

    /**
     * The HeadlinesResponse model constructor.
     * @property {module:model/HeadlinesResponse}
     */
    HeadlinesResponse,

    /**
     * The HeadlinesResponseMeta model constructor.
     * @property {module:model/HeadlinesResponseMeta}
     */
    HeadlinesResponseMeta,

    /**
     * The HeadlinesResponseMetaPagination model constructor.
     * @property {module:model/HeadlinesResponseMetaPagination}
     */
    HeadlinesResponseMetaPagination,

    /**
     * The MetaOne model constructor.
     * @property {module:model/MetaOne}
     */
    MetaOne,

    /**
     * The Model202ErrorObject model constructor.
     * @property {module:model/Model202ErrorObject}
     */
    Model202ErrorObject,

    /**
     * The PaginationOne model constructor.
     * @property {module:model/PaginationOne}
     */
    PaginationOne,

    /**
     * The QuickAlertsBody model constructor.
     * @property {module:model/QuickAlertsBody}
     */
    QuickAlertsBody,

    /**
     * The QuickAlertsBodyData model constructor.
     * @property {module:model/QuickAlertsBodyData}
     */
    QuickAlertsBodyData,

    /**
     * The QuickAlertsResponse model constructor.
     * @property {module:model/QuickAlertsResponse}
     */
    QuickAlertsResponse,

    /**
     * The SearchResponseArrayObject model constructor.
     * @property {module:model/SearchResponseArrayObject}
     */
    SearchResponseArrayObject,

    /**
     * The StatusOne model constructor.
     * @property {module:model/StatusOne}
     */
    StatusOne,

    /**
     * The StructuredFilters model constructor.
     * @property {module:model/StructuredFilters}
     */
    StructuredFilters,

    /**
     * The StructuredFiltersCategories model constructor.
     * @property {module:model/StructuredFiltersCategories}
     */
    StructuredFiltersCategories,

    /**
     * The StructuredFiltersCategoriesObject model constructor.
     * @property {module:model/StructuredFiltersCategoriesObject}
     */
    StructuredFiltersCategoriesObject,

    /**
     * The StructuredFiltersChildrenObjectCategories model constructor.
     * @property {module:model/StructuredFiltersChildrenObjectCategories}
     */
    StructuredFiltersChildrenObjectCategories,

    /**
     * The StructuredFiltersChildrenObjectRegions model constructor.
     * @property {module:model/StructuredFiltersChildrenObjectRegions}
     */
    StructuredFiltersChildrenObjectRegions,

    /**
     * The StructuredFiltersChildrenObjectSectors model constructor.
     * @property {module:model/StructuredFiltersChildrenObjectSectors}
     */
    StructuredFiltersChildrenObjectSectors,

    /**
     * The StructuredFiltersChildrenObjectTopics model constructor.
     * @property {module:model/StructuredFiltersChildrenObjectTopics}
     */
    StructuredFiltersChildrenObjectTopics,

    /**
     * The StructuredFiltersRegions model constructor.
     * @property {module:model/StructuredFiltersRegions}
     */
    StructuredFiltersRegions,

    /**
     * The StructuredFiltersRegionsObject model constructor.
     * @property {module:model/StructuredFiltersRegionsObject}
     */
    StructuredFiltersRegionsObject,

    /**
     * The StructuredFiltersSectors model constructor.
     * @property {module:model/StructuredFiltersSectors}
     */
    StructuredFiltersSectors,

    /**
     * The StructuredFiltersSectorsObject model constructor.
     * @property {module:model/StructuredFiltersSectorsObject}
     */
    StructuredFiltersSectorsObject,

    /**
     * The StructuredFiltersTopics model constructor.
     * @property {module:model/StructuredFiltersTopics}
     */
    StructuredFiltersTopics,

    /**
     * The StructuredFiltersTopicsObject model constructor.
     * @property {module:model/StructuredFiltersTopicsObject}
     */
    StructuredFiltersTopicsObject,

    /**
     * The StructuredFiltersWatchlists model constructor.
     * @property {module:model/StructuredFiltersWatchlists}
     */
    StructuredFiltersWatchlists,

    /**
     * The StructuredFiltersWatchlistsObject model constructor.
     * @property {module:model/StructuredFiltersWatchlistsObject}
     */
    StructuredFiltersWatchlistsObject,

    /**
     * The SubmittedResponse model constructor.
     * @property {module:model/SubmittedResponse}
     */
    SubmittedResponse,

    /**
     * The Views model constructor.
     * @property {module:model/Views}
     */
    Views,

    /**
     * The ViewsObject model constructor.
     * @property {module:model/ViewsObject}
     */
    ViewsObject,

    /**
    * The FiltersApi service constructor.
    * @property {module:api/FiltersApi}
    */
    FiltersApi,

    /**
    * The HeadlinesApi service constructor.
    * @property {module:api/HeadlinesApi}
    */
    HeadlinesApi,

    /**
    * The StreetAccountHistoricalStoriesApi service constructor.
    * @property {module:api/StreetAccountHistoricalStoriesApi}
    */
    StreetAccountHistoricalStoriesApi,

    /**
    * The GetStatusData response wrapper.
    * @property {module:GetCalculationStatusByIdResponseWrapper}
    */
    GetStatusDataResponseWrapper,

    /**
    * The ViewsApi service constructor.
    * @property {module:api/ViewsApi}
    */
    ViewsApi,

};
