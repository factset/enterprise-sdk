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
 * The IntegerConfigDto model module.
 * @module model/IntegerConfigDto
 */
class IntegerConfigDto {
    /**
     * Constructs a new <code>IntegerConfigDto</code>.
     * @alias module:model/IntegerConfigDto
     */
    constructor() { 
        
        IntegerConfigDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>IntegerConfigDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IntegerConfigDto} obj Optional instance to populate.
     * @return {module:model/IntegerConfigDto} The populated <code>IntegerConfigDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IntegerConfigDto();

            if (data.hasOwnProperty('splitType')) {
                obj['splitType'] = ApiClient.convertToType(data['splitType'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} splitType
 */
IntegerConfigDto.prototype['splitType'] = undefined;






export default IntegerConfigDto;

