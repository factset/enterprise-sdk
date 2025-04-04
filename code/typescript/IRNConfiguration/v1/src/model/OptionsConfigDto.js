/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
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
 * The OptionsConfigDto model module.
 * @module model/OptionsConfigDto
 */
class OptionsConfigDto {
    /**
     * Constructs a new <code>OptionsConfigDto</code>.
     * @alias module:model/OptionsConfigDto
     */
    constructor() { 
        
        OptionsConfigDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OptionsConfigDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OptionsConfigDto} obj Optional instance to populate.
     * @return {module:model/OptionsConfigDto} The populated <code>OptionsConfigDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OptionsConfigDto();

            if (data.hasOwnProperty('multiSelectEnabled')) {
                obj['multiSelectEnabled'] = ApiClient.convertToType(data['multiSelectEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('onTheFlyEnabled')) {
                obj['onTheFlyEnabled'] = ApiClient.convertToType(data['onTheFlyEnabled'], 'Boolean');
            }
            if (data.hasOwnProperty('options')) {
                obj['options'] = ApiClient.convertToType(data['options'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {Boolean} multiSelectEnabled
 */
OptionsConfigDto.prototype['multiSelectEnabled'] = undefined;

/**
 * @member {Boolean} onTheFlyEnabled
 */
OptionsConfigDto.prototype['onTheFlyEnabled'] = undefined;

/**
 * @member {Array.<String>} options
 */
OptionsConfigDto.prototype['options'] = undefined;






export default OptionsConfigDto;

