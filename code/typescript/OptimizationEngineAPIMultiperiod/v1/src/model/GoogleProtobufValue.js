/**
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import GoogleProtobufListValue from './GoogleProtobufListValue';
import GoogleProtobufNullValue from './GoogleProtobufNullValue';
import GoogleProtobufStruct from './GoogleProtobufStruct';

/**
 * The GoogleProtobufValue model module.
 * @module model/GoogleProtobufValue
 */
class GoogleProtobufValue {
    /**
     * Constructs a new <code>GoogleProtobufValue</code>.
     * @alias module:model/GoogleProtobufValue
     */
    constructor() { 
        
        GoogleProtobufValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>GoogleProtobufValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/GoogleProtobufValue} obj Optional instance to populate.
     * @return {module:model/GoogleProtobufValue} The populated <code>GoogleProtobufValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new GoogleProtobufValue();

            if (data.hasOwnProperty('nullValue')) {
                obj['nullValue'] = GoogleProtobufNullValue.constructFromObject(data['nullValue']);
            }
            if (data.hasOwnProperty('numberValue')) {
                obj['numberValue'] = ApiClient.convertToType(data['numberValue'], 'Number');
            }
            if (data.hasOwnProperty('stringValue')) {
                obj['stringValue'] = ApiClient.convertToType(data['stringValue'], 'String');
            }
            if (data.hasOwnProperty('boolValue')) {
                obj['boolValue'] = ApiClient.convertToType(data['boolValue'], 'Boolean');
            }
            if (data.hasOwnProperty('structValue')) {
                obj['structValue'] = GoogleProtobufStruct.constructFromObject(data['structValue']);
            }
            if (data.hasOwnProperty('listValue')) {
                obj['listValue'] = GoogleProtobufListValue.constructFromObject(data['listValue']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/GoogleProtobufNullValue} nullValue
 */
GoogleProtobufValue.prototype['nullValue'] = undefined;

/**
 * @member {Number} numberValue
 */
GoogleProtobufValue.prototype['numberValue'] = undefined;

/**
 * @member {String} stringValue
 */
GoogleProtobufValue.prototype['stringValue'] = undefined;

/**
 * @member {Boolean} boolValue
 */
GoogleProtobufValue.prototype['boolValue'] = undefined;

/**
 * @member {module:model/GoogleProtobufStruct} structValue
 */
GoogleProtobufValue.prototype['structValue'] = undefined;

/**
 * @member {module:model/GoogleProtobufListValue} listValue
 */
GoogleProtobufValue.prototype['listValue'] = undefined;






export default GoogleProtobufValue;

