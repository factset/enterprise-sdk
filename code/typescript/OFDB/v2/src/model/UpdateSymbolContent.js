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

/**
 * The UpdateSymbolContent model module.
 * @module model/UpdateSymbolContent
 */
class UpdateSymbolContent {
    /**
     * Constructs a new <code>UpdateSymbolContent</code>.
     * @alias module:model/UpdateSymbolContent
     */
    constructor() { 
        
        UpdateSymbolContent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateSymbolContent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateSymbolContent} obj Optional instance to populate.
     * @return {module:model/UpdateSymbolContent} The populated <code>UpdateSymbolContent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateSymbolContent();

            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Number');
            }
            if (data.hasOwnProperty('field_1')) {
                obj['field_1'] = ApiClient.convertToType(data['field_1'], 'Number');
            }
            if (data.hasOwnProperty('field_2')) {
                obj['field_2'] = ApiClient.convertToType(data['field_2'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} date
 */
UpdateSymbolContent.prototype['date'] = undefined;

/**
 * @member {Number} field_1
 */
UpdateSymbolContent.prototype['field_1'] = undefined;

/**
 * @member {String} field_2
 */
UpdateSymbolContent.prototype['field_2'] = undefined;






export default UpdateSymbolContent;
