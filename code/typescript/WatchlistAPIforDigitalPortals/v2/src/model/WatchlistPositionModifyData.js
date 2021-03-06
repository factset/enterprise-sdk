/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The WatchlistPositionModifyData model module.
 * @module model/WatchlistPositionModifyData
 */
class WatchlistPositionModifyData {
    /**
     * Constructs a new <code>WatchlistPositionModifyData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/WatchlistPositionModifyData
     * @param name {String} Name of watchlist
     * @param id {Number} Position id.
     */
    constructor(name, id) { 
        
        WatchlistPositionModifyData.initialize(this, name, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, id) { 
        obj['name'] = name;
        obj['id'] = id;
    }

    /**
     * Constructs a <code>WatchlistPositionModifyData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/WatchlistPositionModifyData} obj Optional instance to populate.
     * @return {module:model/WatchlistPositionModifyData} The populated <code>WatchlistPositionModifyData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new WatchlistPositionModifyData();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('notation')) {
                obj['notation'] = ApiClient.convertToType(data['notation'], 'String');
            }
            if (data.hasOwnProperty('additionalData')) {
                obj['additionalData'] = ApiClient.convertToType(data['additionalData'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Name of watchlist
 * @member {String} name
 */
WatchlistPositionModifyData.prototype['name'] = undefined;

/**
 * Position id.
 * @member {Number} id
 */
WatchlistPositionModifyData.prototype['id'] = undefined;

/**
 * Identifier of the notation
 * @member {String} notation
 */
WatchlistPositionModifyData.prototype['notation'] = undefined;

/**
 * Additional data to the watched position.
 * @member {String} additionalData
 */
WatchlistPositionModifyData.prototype['additionalData'] = undefined;






export default WatchlistPositionModifyData;

