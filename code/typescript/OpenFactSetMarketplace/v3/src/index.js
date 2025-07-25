/**
 * Open:FactSet Marketplace API
 * This API provides read-only access to marketplace products and partners.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import AttributesGroupsItem from './model/AttributesGroupsItem';
import DocumentsItems from './model/DocumentsItems';
import Error from './model/Error';
import ErrorResponse from './model/ErrorResponse';
import Meta from './model/Meta';
import MetaPagination from './model/MetaPagination';
import Partner from './model/Partner';
import PartnerAddress from './model/PartnerAddress';
import PartnerSocialMedia from './model/PartnerSocialMedia';
import PartnerSuccessResponse from './model/PartnerSuccessResponse';
import PartnersSuccessResponse from './model/PartnersSuccessResponse';
import Product from './model/Product';
import ProductPartner from './model/ProductPartner';
import ProductSuccessResponse from './model/ProductSuccessResponse';
import ProductsSuccessResponse from './model/ProductsSuccessResponse';
import RelatedProducts from './model/RelatedProducts';
import ThirdPartyUrls from './model/ThirdPartyUrls';

import PartnersApi from './api/PartnersApi';
import ProductsApi from './api/ProductsApi';


/**
* Open:FactSet Marketplace client library for JavaScript.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var openfactsetmarketplace = require('index'); // See note below*.
* var xxxSvc = new openfactsetmarketplace.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new openfactsetmarketplace.Yyy(); // Construct a model instance.
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
* var xxxSvc = new openfactsetmarketplace.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new openfactsetmarketplace.Yyy(); // Construct a model instance.
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
     * The AttributesGroupsItem model constructor.
     * @property {module:model/AttributesGroupsItem}
     */
    AttributesGroupsItem,

    /**
     * The DocumentsItems model constructor.
     * @property {module:model/DocumentsItems}
     */
    DocumentsItems,

    /**
     * The Error model constructor.
     * @property {module:model/Error}
     */
    Error,

    /**
     * The ErrorResponse model constructor.
     * @property {module:model/ErrorResponse}
     */
    ErrorResponse,

    /**
     * The Meta model constructor.
     * @property {module:model/Meta}
     */
    Meta,

    /**
     * The MetaPagination model constructor.
     * @property {module:model/MetaPagination}
     */
    MetaPagination,

    /**
     * The Partner model constructor.
     * @property {module:model/Partner}
     */
    Partner,

    /**
     * The PartnerAddress model constructor.
     * @property {module:model/PartnerAddress}
     */
    PartnerAddress,

    /**
     * The PartnerSocialMedia model constructor.
     * @property {module:model/PartnerSocialMedia}
     */
    PartnerSocialMedia,

    /**
     * The PartnerSuccessResponse model constructor.
     * @property {module:model/PartnerSuccessResponse}
     */
    PartnerSuccessResponse,

    /**
     * The PartnersSuccessResponse model constructor.
     * @property {module:model/PartnersSuccessResponse}
     */
    PartnersSuccessResponse,

    /**
     * The Product model constructor.
     * @property {module:model/Product}
     */
    Product,

    /**
     * The ProductPartner model constructor.
     * @property {module:model/ProductPartner}
     */
    ProductPartner,

    /**
     * The ProductSuccessResponse model constructor.
     * @property {module:model/ProductSuccessResponse}
     */
    ProductSuccessResponse,

    /**
     * The ProductsSuccessResponse model constructor.
     * @property {module:model/ProductsSuccessResponse}
     */
    ProductsSuccessResponse,

    /**
     * The RelatedProducts model constructor.
     * @property {module:model/RelatedProducts}
     */
    RelatedProducts,

    /**
     * The ThirdPartyUrls model constructor.
     * @property {module:model/ThirdPartyUrls}
     */
    ThirdPartyUrls,

    /**
    * The PartnersApi service constructor.
    * @property {module:api/PartnersApi}
    */
    PartnersApi,

    /**
    * The ProductsApi service constructor.
    * @property {module:api/ProductsApi}
    */
    ProductsApi,

};
