chrome.action.onClicked.addListener((tab) => {
    const url = chrome.runtime.getURL("index.html");
    chrome.tabs.create({ url: url });
  });