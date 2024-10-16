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
 * The SentimentConfigDto model module.
 * @module model/SentimentConfigDto
 */
class SentimentConfigDto {
    /**
     * Constructs a new <code>SentimentConfigDto</code>.
     * @alias module:model/SentimentConfigDto
     */
    constructor() { 
        
        SentimentConfigDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SentimentConfigDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SentimentConfigDto} obj Optional instance to populate.
     * @return {module:model/SentimentConfigDto} The populated <code>SentimentConfigDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SentimentConfigDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'Number');
            }
            if (data.hasOwnProperty('color')) {
                obj['color'] = ApiClient.convertToType(data['color'], 'String');
            }
            if (data.hasOwnProperty('isHidden')) {
                obj['isHidden'] = ApiClient.convertToType(data['isHidden'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
SentimentConfigDto.prototype['id'] = undefined;

/**
 * @member {String} name
 */
SentimentConfigDto.prototype['name'] = undefined;

/**
 * @member {Number} code
 */
SentimentConfigDto.prototype['code'] = undefined;

/**
 * @member {String} color
 */
SentimentConfigDto.prototype['color'] = undefined;

/**
 * @member {Boolean} isHidden
 */
SentimentConfigDto.prototype['isHidden'] = undefined;






export default SentimentConfigDto;

