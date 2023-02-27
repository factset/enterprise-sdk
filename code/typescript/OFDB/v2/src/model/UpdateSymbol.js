/**
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UpdateSymbolData from './UpdateSymbolData';

/**
 * The UpdateSymbol model module.
 * @module model/UpdateSymbol
 */
class UpdateSymbol {
    /**
     * Constructs a new <code>UpdateSymbol</code>.
     * Any arbitary set of fields that are provided while creating the ofdb and their values.
     * @alias module:model/UpdateSymbol
     */
    constructor() { 
        
        UpdateSymbol.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateSymbol</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateSymbol} obj Optional instance to populate.
     * @return {module:model/UpdateSymbol} The populated <code>UpdateSymbol</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateSymbol();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [UpdateSymbolData]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/UpdateSymbolData>} data
 */
UpdateSymbol.prototype['data'] = undefined;






export default UpdateSymbol;
