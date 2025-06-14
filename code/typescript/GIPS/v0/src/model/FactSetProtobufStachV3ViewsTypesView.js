/**
 * GIPS API
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FactSetProtobufStachV3TableView from './FactSetProtobufStachV3TableView';
import FactSetProtobufStachV3ViewsTypesViewTypeOneofCase from './FactSetProtobufStachV3ViewsTypesViewTypeOneofCase';

/**
 * The FactSetProtobufStachV3ViewsTypesView model module.
 * @module model/FactSetProtobufStachV3ViewsTypesView
 */
class FactSetProtobufStachV3ViewsTypesView {
    /**
     * Constructs a new <code>FactSetProtobufStachV3ViewsTypesView</code>.
     * @alias module:model/FactSetProtobufStachV3ViewsTypesView
     */
    constructor() { 
        
        FactSetProtobufStachV3ViewsTypesView.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FactSetProtobufStachV3ViewsTypesView</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FactSetProtobufStachV3ViewsTypesView} obj Optional instance to populate.
     * @return {module:model/FactSetProtobufStachV3ViewsTypesView} The populated <code>FactSetProtobufStachV3ViewsTypesView</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FactSetProtobufStachV3ViewsTypesView();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('displayName')) {
                obj['displayName'] = ApiClient.convertToType(data['displayName'], 'String');
            }
            if (data.hasOwnProperty('table')) {
                obj['table'] = FactSetProtobufStachV3TableView.constructFromObject(data['table']);
            }
            if (data.hasOwnProperty('typeCase')) {
                obj['typeCase'] = FactSetProtobufStachV3ViewsTypesViewTypeOneofCase.constructFromObject(data['typeCase']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
FactSetProtobufStachV3ViewsTypesView.prototype['name'] = undefined;

/**
 * @member {String} displayName
 */
FactSetProtobufStachV3ViewsTypesView.prototype['displayName'] = undefined;

/**
 * @member {module:model/FactSetProtobufStachV3TableView} table
 */
FactSetProtobufStachV3ViewsTypesView.prototype['table'] = undefined;

/**
 * @member {module:model/FactSetProtobufStachV3ViewsTypesViewTypeOneofCase} typeCase
 */
FactSetProtobufStachV3ViewsTypesView.prototype['typeCase'] = undefined;






export default FactSetProtobufStachV3ViewsTypesView;

