/**
 * OFDB API
 * OFDB api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: client.portfolio.data.engineering@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UpdateSymbolDate3DData from './UpdateSymbolDate3DData';

/**
 * The UpdateSymbolDate3D model module.
 * @module model/UpdateSymbolDate3D
 */
class UpdateSymbolDate3D {
    /**
     * Constructs a new <code>UpdateSymbolDate3D</code>.
     * Any arbitary set of fields that are provided while creating the ofdb and their values.
     * @alias module:model/UpdateSymbolDate3D
     */
    constructor() { 
        
        UpdateSymbolDate3D.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateSymbolDate3D</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateSymbolDate3D} obj Optional instance to populate.
     * @return {module:model/UpdateSymbolDate3D} The populated <code>UpdateSymbolDate3D</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateSymbolDate3D();

            if (data.hasOwnProperty('data')) {
                obj['data'] = UpdateSymbolDate3DData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/UpdateSymbolDate3DData} data
 */
UpdateSymbolDate3D.prototype['data'] = undefined;






export default UpdateSymbolDate3D;

