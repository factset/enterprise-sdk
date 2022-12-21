# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.ExchangeDataFeedDataModel.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.ExchangeDataFeedDataModel.model.error_response import ErrorResponse
from fds.sdk.ExchangeDataFeedDataModel.model.rt_data_model_products import RTDataModelProducts
