
# flake8: noqa

# Import all APIs into this package.
# If you have many APIs here with many many models used in each API this may
# raise a `RecursionError`.
# In order to avoid this, import only the API that you directly need like:
#
#   from .api.calendar_events_api import CalendarEventsApi
#
# or import this package, but before doing it, use:
#
#   import sys
#   sys.setrecursionlimit(n)

# Import APIs into API package:
from fds.sdk.EventsandTranscripts.api.calendar_events_api import CalendarEventsApi
from fds.sdk.EventsandTranscripts.api.events_audio_api import EventsAudioApi
from fds.sdk.EventsandTranscripts.api.near_real_time_transcripts_api import NearRealTimeTranscriptsApi
from fds.sdk.EventsandTranscripts.api.transcripts_api import TranscriptsApi
