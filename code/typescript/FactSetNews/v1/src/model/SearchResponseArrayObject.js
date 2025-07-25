/**
 * News API
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SearchResponseArrayObject model module.
 * @module model/SearchResponseArrayObject
 */
class SearchResponseArrayObject {
    /**
     * Constructs a new <code>SearchResponseArrayObject</code>.
     * @alias module:model/SearchResponseArrayObject
     */
    constructor() { 
        
        SearchResponseArrayObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SearchResponseArrayObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SearchResponseArrayObject} obj Optional instance to populate.
     * @return {module:model/SearchResponseArrayObject} The populated <code>SearchResponseArrayObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SearchResponseArrayObject();

            if (data.hasOwnProperty('storyDateAndTime')) {
                obj['storyDateAndTime'] = ApiClient.convertToType(data['storyDateAndTime'], 'Date');
            }
            if (data.hasOwnProperty('headlines')) {
                obj['headlines'] = ApiClient.convertToType(data['headlines'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('source')) {
                obj['source'] = ApiClient.convertToType(data['source'], 'String');
            }
            if (data.hasOwnProperty('product')) {
                obj['product'] = ApiClient.convertToType(data['product'], 'String');
            }
            if (data.hasOwnProperty('primarySymbols')) {
                obj['primarySymbols'] = ApiClient.convertToType(data['primarySymbols'], ['String']);
            }
            if (data.hasOwnProperty('symbols')) {
                obj['symbols'] = ApiClient.convertToType(data['symbols'], ['String']);
            }
            if (data.hasOwnProperty('subjects')) {
                obj['subjects'] = ApiClient.convertToType(data['subjects'], ['String']);
            }
            if (data.hasOwnProperty('fdsSubject')) {
                obj['fdsSubject'] = ApiClient.convertToType(data['fdsSubject'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The timestamp when the headline was published.
 * @member {Date} storyDateAndTime
 */
SearchResponseArrayObject.prototype['storyDateAndTime'] = undefined;

/**
 * The Headline.
 * @member {String} headlines
 */
SearchResponseArrayObject.prototype['headlines'] = undefined;

/**
 * The ID associated with the headline.
 * @member {String} id
 */
SearchResponseArrayObject.prototype['id'] = undefined;

/**
 * The URI associated with the headline.
 * @member {String} url
 */
SearchResponseArrayObject.prototype['url'] = undefined;

/**
 * The source associated with the headline.
 * @member {String} source
 */
SearchResponseArrayObject.prototype['source'] = undefined;

/**
 * The source associated with the headline.
 * @member {String} product
 */
SearchResponseArrayObject.prototype['product'] = undefined;

/**
 * The primary symbols associated with the headline.
 * @member {Array.<String>} primarySymbols
 */
SearchResponseArrayObject.prototype['primarySymbols'] = undefined;

/**
 * All symbols associated with the headline.
 * @member {Array.<String>} symbols
 */
SearchResponseArrayObject.prototype['symbols'] = undefined;

/**
 * All subjects associated with the headline.
 * @member {Array.<String>} subjects
 */
SearchResponseArrayObject.prototype['subjects'] = undefined;

/**
 * The filters associated with the headline.
 * @member {String} fdsSubject
 */
SearchResponseArrayObject.prototype['fdsSubject'] = undefined;






export default SearchResponseArrayObject;

