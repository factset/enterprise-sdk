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
 * The NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData model module.
 * @module model/NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData
 */
class NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData {
    /**
     * Constructs a new <code>NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData</code>.
     * The data member contains the request&#39;s primary data.
     * @alias module:model/NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData
     * @param symbologyIdentifier {String} FactSet Symbology Identifier. See the endpoint description for valid FactSet Symbology Identifier types.
     */
    constructor(symbologyIdentifier) { 
        
        NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData.initialize(this, symbologyIdentifier);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, symbologyIdentifier) { 
        obj['symbologyIdentifier'] = symbologyIdentifier;
    }

    /**
     * Constructs a <code>NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData} obj Optional instance to populate.
     * @return {module:model/NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData} The populated <code>NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData();

            if (data.hasOwnProperty('symbologyIdentifier')) {
                obj['symbologyIdentifier'] = ApiClient.convertToType(data['symbologyIdentifier'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Symbology Identifier. See the endpoint description for valid FactSet Symbology Identifier types.
 * @member {String} symbologyIdentifier
 */
NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData.prototype['symbologyIdentifier'] = undefined;






export default NotationCrossReferenceFactSetIdentifierListByFactSetIdentifierData;

