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
 * The WatchlistPositionDeleteDataPosition model module.
 * @module model/WatchlistPositionDeleteDataPosition
 */
class WatchlistPositionDeleteDataPosition {
    /**
     * Constructs a new <code>WatchlistPositionDeleteDataPosition</code>.
     * Position of the watchlist.
     * @alias module:model/WatchlistPositionDeleteDataPosition
     * @param id {Number} Identifier of a position.
     */
    constructor(id) { 
        
        WatchlistPositionDeleteDataPosition.initialize(this, id);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id) { 
        obj['id'] = id;
    }

    /**
     * Constructs a <code>WatchlistPositionDeleteDataPosition</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/WatchlistPositionDeleteDataPosition} obj Optional instance to populate.
     * @return {module:model/WatchlistPositionDeleteDataPosition} The populated <code>WatchlistPositionDeleteDataPosition</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new WatchlistPositionDeleteDataPosition();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of a position.
 * @member {Number} id
 */
WatchlistPositionDeleteDataPosition.prototype['id'] = undefined;






export default WatchlistPositionDeleteDataPosition;

